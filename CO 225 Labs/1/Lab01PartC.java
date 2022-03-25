public class Lab01PartC {
    
    public static void main(String args[]) {
      String month = "JANUARY"; // example
	  // System.out.println(args[0]);
      showMonthValue(month , (String)args[0]); //pasing the example month to print number and command line input to print the next months
    }
    
    public static void showMonthValue(String month , String input){
        int monthValue =0;
        
        //Implement C a
        if(month=="JANUARY"){//checking the example input
			monthValue =1;
		}else if(month=="FEBRUARY"){
			monthValue =2;
		}else if(month=="MARCH"){
			monthValue =3;
		}else if(month=="APRIL"){
			monthValue =4;
		}else if(month=="MAY"){
			monthValue =5;
		}else if(month=="JUNE"){
			monthValue =6;
		}else if(month=="JULY"){
			monthValue =7;
		}else if(month=="AUGUST"){
			monthValue =8;
		}else if(month=="SEPTMBER"){
			monthValue =9;
		}else if(month=="OCTOBER"){
			monthValue =10;
		}else if(month=="NOVEMBER"){
			monthValue =11;
		}else if(month=="DECEMBER"){
			monthValue =12;
		}
		System.out.println(monthValue); //printing the example month number
		
		
		int val =0;
		boolean isVal = false;
        //Implement C b
		String months[] = {"JANUARY", "FEBRUARY" , "MARCH" , "APRIL" , "MAY" , "JUNE" , "JULY" , "AUGUST" , "SEPTMBER" , "OCTOBER" , "NOVEMBER" , "DECEMBER"};
		
		while(val<11){
			
			if(input.equals(months[val])){ //if command line input equals the month[val]
				isVal = true ;
			}
			val++;
			while(isVal && val<12){ //printing the next months
				System.out.println(months[val]);
				val++;
			}
		}
		
    }
    
}