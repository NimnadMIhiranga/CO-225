/*
	*E-18-180
	*Kodituwakku M.K.N.M.
	*Lab03PartA
*/
	import java.util.Scanner;
public class Lab03PartA
{
    public static void main(String args[])
    {
		//Implemnt Lab03PartA
    System.out.print("Enter the number of rows : ");

    // Scanner object to get the numnber of rows from the user
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // n number of rows
    sc.close();

    int num = n*(n+1)/2; // to get the triangle number ex:if n = 5 num = 15

    
    int[] arr = new int[num];
    // adding values to the array
    for(int j=0; j<num; j++){
      arr[j]= num -j;
     
    }

    // printing output
    for(int i=0; i<n; i++){
     
      int k = n - 1;
      int x = i + k;
      for(int j =0; j<i+1; j++){
        if(j==0){
          System.out.print("  "+ arr[i]);
        }else{
          
          System.out.print("  "+ arr[x]);
          k--;
          x+=k;
        }
      }
      System.out.println("");
      
    }


	}
	
}
	