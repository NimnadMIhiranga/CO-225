import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;


public class Lab01PartD {
    
    public static void main(String args[]) throws Exception {
       
	  //getting command line inputs
      int countryCode = Integer.parseInt(args[1]); 
      String birthDate = args[0];
      
      // Implement D - Calculate age in years
      int age = 0; 
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      Date date =new SimpleDateFormat("yyyy/MM/dd").parse(birthDate); 
      Instant instant = date.toInstant();
      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
      LocalDate givenDate = zone.toLocalDate(); //getting system date
	  Period period = Period.between(givenDate, LocalDate.now());
	  age = period.getYears(); //getting age by years
  
      showTicketPrice(countryCode , age);
    }
    
    public static void showTicketPrice(int countryCode , int age){
        //implement D - Calculate ticket price and show ticket price 
		int price = 200 ; //default ticket price
		if(age>=65){ //if age is more or equals 65 
			price/=2; //%50 discount
			if(countryCode==8){ // if Non SAARC country
				price+=(price*.65);
			}else if(countryCode<7){ //if SAARCH country
				price+=(price*.35);
			}
		}else if(age>=5){ //if age is more than or equals 5
			if(countryCode==8){ //if non SAARC country
				price+=(price*.65);
			}else if(countryCode<7){ //if SAARC country
				price+=(price*.35);
			}
		}else{ //for childrens under age 5
			price =0;
		}
		System.out.println(price); //printing the price
    }
    
}



