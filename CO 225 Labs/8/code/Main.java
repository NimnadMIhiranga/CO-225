/*
	E/18/180
	Kodituwakku M.K.N.M.
	Lab 08 : Java Concurrency (Threads)

*/


class Main { 
    public static int [][] a =
		{		{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
		};
    
    public static int [][] b = 
		{		{1 },
				{1 },
				{1 }
		};


    public static void print_matrix(int [][] a) {
	for(int i=0; i < a.length; i++) {
	    for(int j=0; j< a[i].length; j++) 
		System.out.print(a[i][j] + " "); 
	    System.out.println();
	}
    }
    

	static int result[][] = new int[a.length][b[0].length];

    public static void main(String [] args) { 

	//int [][] x = Matrix.multiply(a, b);
	int rowCount;
	int colCount;
	int count = 0;
	
	Thread [] t = new Thread[b.length];

	//use different thread for each row operations
	for(rowCount = 0 ; rowCount < a.length; rowCount++)
                   {
                        for (colCount = 0 ; colCount < b[0].length; colCount++ )
                        {
                                // creating thread for multiplications
                            t[count] = new Thread(new Matrix( a, b, result));
                            t[count].start(); //thread start 
                            count++;
                        }

	// joining threads
	for(int i=0; i<count; i++)
	{  
        try{
		
			t[i].join();
	
		}catch (InterruptedException e){
				System.out.println("Thread was interrupted");
		//thread was interrupted
	
		}
	
	}
                        
                   }
	print_matrix(result); // see if the multipication is correct 	

    }
}

/*
Questions

1. How to use threads to parallelize the operation?
	*We can use one thread to calculate the one row in the result matrix. Therefor if we use more than one thread it will be fast to get the output.Since all the threads that are using parallely operation of calculating elements of the output matrix c is parallelized.

2. How many threads are usued?
	*Number of threads to use = (Number of rows of the first matrix) x (Number of columns of the second matrix)

3. How to allocate work for each thread (recall it is the run function which all the threads execute)
	*Each thread is used to calculate each element of the output matrix c.Since run method is called when a thread starts, the calculation of each element can be done in run method.Therefore the run method calculates one element per thread.

4. How to synchronize?
	*Since the calculation of elements is done in the run method and no other methods are used we do not need synchronization.Because each thread is allowed to access the run method without restriction, as there is only one thread actually accessing the method.But if there were any other methods or objects shared by all the threads that method or object need to be synchronized 

Extra
1. Is this implementation cache friendly?
	*No

2. Can you think of a way to make it so?
	*We can do this by using threadpool because in the threadpool only a constant number of threads are used and they are being shared for the work that are being done.


*/