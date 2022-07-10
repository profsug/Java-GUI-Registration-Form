
/**
 * Write a description of class Course here.
 *
 * @author (20049248 Sugam Dangal)
 * @version (a version number or a date)
 */


public class Course 
{
    
    //Initializing the variables
    public String courseID;
    public String courseName;
    public String courseLeader;
    public int duration;
    //Creating constructors
    public Course(String courseID,String courseName,int duration ){
        this.courseID=courseID;
        
        this.courseName=courseName;
        this.courseLeader="";
        this.duration=duration;
    }
    //Create accessor and mutator method for the variables.
    //Create get method for courseID
    public String getcourseID(){
        return  this.courseID;
    }
    //Create method for coursename
    public String getcoursename(){
        return this.courseName;
    }
    //Create set method for courseleader
    public String getcourseleader(){
        return this.courseLeader;
    }
    //Create set method for courseleader
    public void setcourseLeader( String courseleader){
        this.courseLeader=courseleader;
    }
    //Create get method for duration
    public int getduration(){
        return  this.duration;
    }
    //Create a method for  displaying all parameters
    public void display(){
        System.out.println("The course ID is" +  this.courseID);
        System.out.println("The name of the course  " +  this.courseName);
        System.out.println("The Duration of course is " +  this.duration);
        if(this.courseLeader.equals(""))
        {
            System.out.println("Empty courseLeader");
        }
        else{
            System.out.println("Name of the course Leader is:"+this.courseLeader);
        
       
    }
}
}

