/*
	E/18/180
	Kodituwakku M.K.N.M.
	Lab 08 : Java Concurrency (Threads)

*/

public class Matrix extends Thread { 

    private static int [][] a; 
    private static int [][] b; 
    private static int [][] c; 

    /* You might need other variables as well */

    public Matrix(int mat1[][], int mat2[][], int mat3[][]) { // need to change this, might need some information 
		this.a = mat1;
		this.b = mat2;
		this.c = mat3;
	}

    public synchronized static int [][] multiply(int [][] a, int [][] b) {

	/* check if multipication can be done, if not 
	 * return null 
	 * allocate required memory 
	 * return a * b
	 */

	int x = a.length; 
	int y = b[0].length; 

	int z1 = a[0].length; 
	int z2 = b.length; 

	if(z1 != z2) { 
	    System.out.println("Cannnot multiply");
	    return null;
	}

//	int [][] c = new int [x][y]; 
	int i, j, k, s; 

	for(i=0; i<x; i++) 
	    for(j=0; j<y; j++) {
		for(s=0, k=0; k<z1; k++) 
		    s += a[i][k] * b[k][j];
		c[i][j] = s;
	    }

	return c; 
    }

	@Override
	public void run(){
		c=multiply(this.a,this.b);
	}

}