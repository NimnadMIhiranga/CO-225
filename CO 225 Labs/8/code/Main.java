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

	//use differend thread for each row operation
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
	
		//thread was interrupted
	
		}
	
	}
                        
                   }
	print_matrix(result); // see if the multipication is correct 	

    }
}


