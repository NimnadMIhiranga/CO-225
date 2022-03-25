public class Lab01PartB {
    
    public static void main(String args[]) {
      int number = Integer.parseInt(args[0]); // example
      findEvenOrOdd(number); //passing the command line input
    }
    
    public static void findEvenOrOdd(int number){
        //Implement B a
        if(number%2==0){ //if number is an even number
			System.out.println("Even");
		}else{ //if number is an odd number
			System.out.println("Odd"); 
		}
		
        //Implement B b
		if(number%2==0){//if number is an even number
			for(int i=0 ; i<5 ; i++){ //printing nexr 5 even numbers
				number+=2;
				System.out.println(number);
			}
			//System.out.println("even");
		}else{ //if number is an odd number
			for(int i=0 ; i<3 ; i++){ // printing next 3 odd numbers
				number+=2;
				System.out.println(number);
			}
			//System.out.println("odd");
		}
    }
    
}