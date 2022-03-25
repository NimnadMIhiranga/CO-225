import java.util.*;
import java.io.*;


class Main{
    
    public static void main(String[] args) throws FileNotFoundException , IOException{

        //Student arraylist to store type Student of the class
        ArrayList<Student> classList = new ArrayList<> () ;

        try (BufferedReader descriptor = new BufferedReader(new FileReader("co225-classlist.txt"))){
            String line = null;
            //System.out.println(!line.equals(""));

            //reding from file using BufferedReader and adding Student instances to the ArrayList
            while((line=descriptor.readLine())!= null){
                //  System.out.println(line);
                classList.add(new Student(line));
            } 

            //closing the BufferedReader
            descriptor.close(); 

            FileWriter write1 = new FileWriter("co225-inglegibleclasslist.txt"); //to write co225-inglegibleclasslist.txt file
            FileWriter write2 = new FileWriter("co225-classlist.txt"); //to write co225-classList.txt file
            
            for(Student stu:classList){
                //System.out.println(stu.studentAttendence());

                if(stu.studentAttendence()<80){  //if student attendence precentage is less than 80%
                    write1.write(stu.getName()+"\n");
                    write2.write(stu.getName()+"-ineligible\n");
                }else{
                    write2.write(stu.getName()+"\n");
                }
            }
            //Closing the write
            write1.close();
            write2.close();

        }
    }
}