import java.util.Random;

public class Student{

    //Name and Attendance attributes for each student
    private String name;
    private int attendence;

    //Static variables to keep track of student count and total attendance value to generate average attendance
    protected static int totalAttendence = 0;
    protected static int studentCount = 0;

    //constant for number of students in the class
    //final int CLASS_SIZE = 61;

    public Student(){
        super();
        studentCount++; //Increment student count
    }

    public Student(String name){
        super();
        Random rand = new Random();
        this.name = name;
        this.attendence = rand.nextInt(46); //making a random attendence between 0 and 45
        //System.out.println(this.attendence);
        totalAttendence += this.attendence; //adding to total attendence
        studentCount++; //incrementing students count
    }

    //to return the name
    public String getName(){
        return this.name;
    }

    //to return the attendence
    public int getAttendence(){
        return this.attendence;
    }

    //name change
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student name : " + getName() + " , attendence : "+getAttendence();
    }

    //return the student attendence precentage
    public int studentAttendence(){
        return(this.attendence*100/45);
    }

    //returns the class attendence percentage
    public int classAttendence(){
        return totalAttendence*100/(studentCount*45);
    }
}
