import java.util.*;
import java.io.*;

public class Copy extends GenericCommand { 

    /* This command outputs the content of file at filename given in argument
     * This command takes two arguments which are source file name & destination file name
     */ 
    public void handleCommand(String [] args) { 

		//No argument is given
    	if(!args[0].equals("copy")) someThingWrong(); 
    	
		//if there is wrong number of arguments inputed printing the error message
		if(args.length != 3) { 
		    System.out.println("Usage: less <source> <destination>");
		    return;
		}
		
		
		try {
			//Opening the two files
			File fin = new File(args[1]);
			File fout = new File(args[2]);
			
			//If source and destination are the same file
			if (fin.equals(fout)) {
				System.out.println("Source file and destination file are the same!");
				return;
			}
			
			//Instatiate InputStream and OutputStream objects to copy files
			InputStream source = new FileInputStream(fin);
			OutputStream destination = new FileOutputStream(fout);
			
			//Read buffer of 1024 bytes (File is copied 1024 bytes at a time)
			byte[] buffer =  new byte[1024];
			
			//Initiate a variable to store length of current buffer
			int length;
			
			//While the buffer is not  at the End of File, write data in buffer to destination file
			while ((length = source.read(buffer)) > 0) {
				destination.write(buffer, 0, length);
			}
		
			this.commandCounter++;		//Increment command count if there is a successful execution of command
			source.close();			//Close source file
			destination.close();			//Close destination file
			return;
		}
		catch (FileNotFoundException e) { //If file does not exist
			System.out.println("Invalid source file or destination file!");		//Handles FileNotFound exception
			return;
		}
		catch (IOException e) {//If there is a error in file reading
			System.out.println("Failed to copy data!");			//Handles IO Exception when trying to copy data
			return;
		}
		
		
		
		
    }
    
}