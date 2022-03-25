public class Lab01PartA {
    
    public static void main(String args[]) {
      int marks = 100	; // example
      showGrade(marks);
    }
    
    public static void showGrade(int marks){
        //Implement A
		switch (marks/10){
			//Grade A limit
			case 10:
			case 9:
			case 8:
				System.out.println("A");
				break;
				
			//Grade B limit
			case 7:
			case 6:
				if(marks>64){
				System.out.println("B");
				break;
				}else{
					//Grade C
					System.out.println("C");
					break;
				}
				
			case 5:
				if(marks>54){
				System.out.println("C");
				break;
				}else{
					//Grade D
					System.out.println("D");
					break;
				}
			//Grade F limit
			default:	
				System.out.println("F");
			
		}
		
    }
    
}