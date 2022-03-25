import java.util.*;
import java.io.*;

public class Less extends GenericCommand { 

    /* This command outputs the content of file at filename given in argument
     * This command takes one argument which is the file name
     */ 
    public void handleCommand(String [] args) { 
	
		//error handeling
		if(!args[0].equals("less")) someThingWrong(); 
	
		//if there is wrong number of arguments inputed printing the error message
		if(args.length != 2) { 
		    System.out.println("Usage: less <filename>");
		    return;
		}
	
		//Opening the file
		//If file does not exist or file is unreadable exception is thrown
		try {
			String file = new File(args[1]).getAbsolutePath();	//Opening the file
			BufferedReader bufferRead = new BufferedReader(new FileReader(file));	//BufferedReader to read from file
			
			String line;	//initialzing a string to store each line read
			
			while( (line = bufferRead.readLine()) != null ) {	//While there is a another line in the file
				System.out.println(line);		//Printing line to console
			}
			
			bufferRead.close();			//Close file after reading
			this.commandCounter++;	//Increment command count if there is a successful execution of command
			return;
		}
		
		catch (FileNotFoundException e) {			//If file does not exist
			System.out.println("File not found!");		//Print error message and return
			return;
		}
		
		catch (IOException e) {		//If there is a error in file reading
			System.out.println("Error while reading from file!");	//Handles IO exception when reading file
			return;
		}
		

    }
}