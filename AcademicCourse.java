 


/**
 * Write a description of class AcademicCourse here.
 *
 * @author (20049248 Sugam Dangal)
 * @version (a version number or a date)
 */
public class AcademicCourse extends Course
{
   private String lecturerName;
   private String level;
   private String credit;
   private String startingDate;
   private String completionDate;
   private int numberOfAssessments;
   private boolean isRegistered;    
   //Create a constructor for AcademicCourse
     public AcademicCourse ( String courseID, String courseName, int duration, String level, String credit, int numberOfAssessments){
       super (courseID, courseName, duration);
       this.level=level;
       this.credit=credit;
       lecturerName="";
       startingDate="";
       completionDate="";
       this.numberOfAssessments= numberOfAssessments;
       isRegistered=false;
  }
  //Creating accessor methods for each attribute
   public String getlecturerName(){
       return this.lecturerName;
   } 
   //Creating a method to set lectureName
   public void setlectureName (String lecturerName){
       this.lecturerName=lecturerName;
   }
   public String getlevel(){
       return this.level;
   }
   public String getcredit(){
       return this.credit;
   }
   public String getstartingDate(){
       return this.startingDate;
   }
   public String getcompletionDate(){
       return this.completionDate;
   }
   public int getnumberOfAssessments(){
       return this.numberOfAssessments;
   }
   public Boolean getisRegistered(){
       return this.isRegistered;
   } 
   //Create a method to set numberOfAssessments
    public void setnumberOfAssessments(int numberOfAssessments){
       this.numberOfAssessments= numberOfAssessments;
   }
   /*Create a method to register
    * If a AcademicCourse is not registered the values will be accepted 
    * otherwise a message will be displayed.
    */
   public void register ( String courseLeader, String lecturerName, String startingDate, String completionDate){
       if(isRegistered==true){
         super.courseLeader=courseLeader;
         this.lecturerName=lecturerName;
         this.startingDate=startingDate;
         this.completionDate=completionDate;
         System.out.println("  AcademicCourse has been register");
        
       }
       else if( isRegistered==false){
           System.out.println( "This course has already been registered");
           System.out.println("The lecturer's name is "+this.lecturerName);
           System.out.println("The Starting date of course is"+this.startingDate);
           System.out.println("The Completion date of course is "+this.completionDate);
           this.isRegistered = true; //changed the registered to true
        }
    }
        /*Create a method to display AcademicCourse 
         * If a Course is no yet registered the entered values will be displayed 
          * otherwise a message will be displayed.
          */
         public void display(){
         if(isRegistered==true){
           
           super.display();
           System.out.println("This Course has already been registered");
           System.out.println("The level of course is " + this.level);
           System.out.println("The total credit hour of the course is" + this.credit);
           System.out.println("The starting date of course is  " +this.startingDate);
           System.out.println("The completition date of course is  " + this.completionDate);
           System.out.println("The total number of assesments in the course is ="+ this.numberOfAssessments);
           
       }
       else{
        System.out.println("The Course ID is  " + this.courseID);
        System.out.println("The  Name of the course is " + this.courseName);
        System.out.println("The name of course leader is" + this.courseLeader);
        System.out.println(" The duration of course is = " + this.duration);
       }
   }   
}

    



