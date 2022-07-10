

/**
 * Write a description of class NonAcademicCourse here.
 *
 * @author (20049248 Sugam Dangal)
 * @version (a version number or a date)
 */
public class NonAcademicCourse extends Course
{
   private String instructorName;
   private String startDate;
   private String completionDate;
   private String examDate;
   private String prerequisite;
   private boolean  isRegistered;
   private boolean isRemoved;
   //Creating a constructor for NonAcademicCourse
   public NonAcademicCourse( String courseID, String courseName, int duration, String prerequisite)
   {
        super(courseID, courseName, duration);
        
        
        this.prerequisite=prerequisite;
        this.startDate="";
        this.completionDate="";
        this.examDate="";
        isRegistered=false ;
        isRemoved=false;
   }
   //Creating accessor methods  attributes
   public String getinstructorName(){
       return this.instructorName;
   }
   public String getstartDate(){
       return this.startDate;
   }
   public String getcompletionDate(){
       return this.completionDate;
   }
   public String getaexamDate(){
       return this.examDate;
   }
   private String getprerequisite(){
       return this.prerequisite;
    }
   public boolean getisRegistered(){
       return this.isRegistered;
   }
   public boolean getisRemoved(){
       return this.isRemoved;
   }
   //Create a method to change the shift if the instructorName
   public void setinstructorName( String instructorName){
     {
     this. instructorName= instructorName;
    }
    
    
   }
   /* Creating a method to register NonAcademicCourse
    * if a Course is not registered ,entered values will be accepted
    * otherwise output is  displayed.
    */
   public void registerNonAcademicCourse( String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
       if(isRegistered==false){
           
        super .setcourseLeader(courseLeader);
         this.instructorName=instructorName;
         this.startDate=startDate;
         this.completionDate=completionDate;
         this.examDate=examDate;
        this.isRegistered=true;
        }
        else if (isRegistered==true){
            System.out.println("Already Registered");
        }
   }
   //Create a method to terminate a hired NonAcademicCourse
   public void remove(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
         if (isRemoved == true){
            System.out.println( "This non academic course is already removed from the list.");
        }
        else if (isRemoved == false){
            super.setcourseLeader (courseLeader);
            this.instructorName = "";
            this.startDate = "";
            this.completionDate = "";
            this.examDate = "";
            this.isRegistered = false;
            this.isRemoved= true;
        }
    }
    
    public void display(){
        super.display();
              if (isRegistered == true){
         System.out.println("Instructor name of non academic course : " + this.instructorName);
         System.out.println("Start date non academic course : " + this.startDate);
         System.out.println("Ending of non academic course : " + this.completionDate);
         System.out.println("The examination date of non academic course : " + this.examDate);
       }
       
        
    }
}













