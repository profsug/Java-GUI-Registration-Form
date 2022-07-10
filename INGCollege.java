
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.util.*;
import javax.swing.table.*;
import javax.swing.JButton;
  /**
 * Write a description of class INGCollege here.
 *
 * @author (20049248 Sugam Dangal)
 * @version (a version number or a date)
 */



public class INGCollege {
    
    
    
    public INGCollege(){
        
        
        //Arraylist 
        ArrayList < Course>CourseList = new ArrayList<Course>();
        ArrayList < AcademicCourse>AcademicCourseList = new ArrayList<AcademicCourse>();
        ArrayList <NonAcademicCourse> NonAcademicCourseList = new ArrayList<NonAcademicCourse>();
        
        
        //Creating frame and adding all the elements inside the frame
        JFrame frame = new JFrame("INGCollege");
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(51, 51, 102));
        frame.setBounds(100, 100, 1145,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font font1 = new Font("SansSerif", Font.PLAIN, 20);
        
        JButton btnAcourse = new JButton("Academic Course");
        btnAcourse.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
        btnAcourse.setBounds(53, 504, 317, 43);
        frame.getContentPane().add(btnAcourse);
        btnAcourse.setBackground(new Color(255, 102, 0));
        btnAcourse.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                
                JFrame frame1 = new JFrame("Academic Course Registration");
                frame1.getContentPane().setBackground(new Color(51, 51, 102));
                frame1.setBounds(100, 100, 1145,800);
                
                frame1.getContentPane().setLayout(null);
                frame1.setVisible(true);
                
                JPanel panel = new JPanel();
                panel.setBackground(new Color(255, 102, 0));
                panel.setBounds(0, 0, 1129, 65);
                frame1.getContentPane().add(panel);
                
                
                
                JLabel ac = new JLabel("Academic Course Registration");
                ac.setForeground(new Color(255, 255, 255));
                ac.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
                panel.add(ac);
                
                JLabel s0 = new JLabel("!!! Please fill all the details correctly and click register to register your course !!!");
                s0.setForeground(new Color(255, 255, 255));
                s0.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
                s0.setBounds(183, 74, 774, 21);
                frame1.getContentPane().add(s0);
                
                JLabel cid = new JLabel("Course ID:");
                cid.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                cid.setForeground(new Color(255, 255, 255));
                cid.setBounds(99, 162, 129, 24);
                frame1.getContentPane().add(cid);
                
                JLabel cname = new JLabel("Course Name:");
                cname.setForeground(new Color(255, 255, 255));
                cname.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                cname.setBounds(645, 164, 161, 21);
                frame1.getContentPane().add(cname);
                
                JLabel lname = new JLabel("Lecturer Name:");
                lname.setForeground(new Color(255, 255, 255));
                lname.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                lname.setBounds(617, 530, 189, 21);
                frame1.getContentPane().add(lname);
                
                JLabel duration = new JLabel("Duration:");
                duration.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                duration.setForeground(new Color(255, 255, 255));
                duration.setBounds(689, 256, 117, 21);
                frame1.getContentPane().add(duration);
                
                JLabel credit = new JLabel("Credit:");
                credit.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                credit.setForeground(new Color(255, 255, 255));
                credit.setBounds(136, 345, 103, 21);
                frame1.getContentPane().add(credit);
                
                JLabel sdate = new JLabel("Start Date:");
                sdate.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                sdate.setForeground(new Color(255, 255, 255));
                sdate.setBounds(682, 455, 149, 24);
                frame1.getContentPane().add(sdate);
                
                JLabel lvl = new JLabel("Level:");
                lvl.setForeground(new Color(255, 255, 255));
                lvl.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                lvl.setBounds(146, 256, 82, 21);
                frame1.getContentPane().add(lvl);
                
                JLabel asses = new JLabel("No of Assesments: ");
                asses.setForeground(new Color(255, 255, 255));
                asses.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                asses.setBounds(584, 345, 232, 21);
                frame1.getContentPane().add(asses);
                
                JLabel compDate = new JLabel("Completion Date:");
                compDate.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                compDate.setForeground(new Color(255, 255, 255));
                compDate.setBounds(15, 455, 219, 21);
                frame1.getContentPane().add(compDate);
                
                JLabel courseLeader = new JLabel("Course Leader:");
                courseLeader.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                courseLeader.setForeground(new Color(255, 255, 255));
                courseLeader.setBounds(81,530,180,21);
                frame1.getContentPane().add(courseLeader);
                
                JTextField txtcourseId = new JTextField();
                txtcourseId.setBounds(250, 156, 200, 30);
                frame1.getContentPane().add(txtcourseId);
                txtcourseId.setFont(font1);
                
                JTextField txtcourseName = new JTextField();
                txtcourseName.setBounds(838, 156, 200, 30);
                frame1.getContentPane().add(txtcourseName);
                txtcourseName.setFont(font1);
                
                JTextField txtlevel = new JTextField();
                txtlevel.setBounds(250, 247, 200, 30);
                frame1.getContentPane().add(txtlevel);
                txtlevel.setFont(font1);
                
                JTextField txtduration = new JTextField();
                txtduration.setBounds(838, 247, 200, 30);
                frame1.getContentPane().add(txtduration);
                txtduration.setFont(font1);
                
                JTextField txtcredit = new JTextField();
                txtcredit.setBounds(250, 336, 200, 30);
                frame1.getContentPane().add(txtcredit);
                txtcredit.setFont(font1);
                
                JTextField txtnOfAssesments = new JTextField();
                txtnOfAssesments.setBounds(838, 336, 200, 30);
                frame1.getContentPane().add(txtnOfAssesments);
                txtnOfAssesments.setFont(font1);
                
                JTextField txtstartDate = new JTextField();
                txtstartDate.setBounds(838, 455, 200, 30);
                frame1.getContentPane().add(txtstartDate);
                txtstartDate.setFont(font1);
                
                JTextField txtcompletionDate = new JTextField();
                txtcompletionDate.setBounds(250, 455, 200, 30);
                frame1.getContentPane().add(txtcompletionDate);
                txtcompletionDate.setFont(font1);
                
                JTextField txtlecturerName = new JTextField();
                txtlecturerName.setBounds(838, 530, 200, 30);
                frame1.getContentPane().add(txtlecturerName);
                txtlecturerName.setFont(font1);
                
                JTextField txtcourseLeader = new JTextField();
                txtcourseLeader.setBounds(250, 530, 200, 30);
                frame1.getContentPane().add(txtcourseLeader);
                txtcourseLeader.setFont(font1);
                
                 JButton addBtn = new JButton("ADD");
                 addBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(txtcourseId.getText().isEmpty() || 
                        txtcourseName.getText().isEmpty() ||
                        txtlevel.getText().isEmpty() ||
                        txtduration.getText().isEmpty() ||
                        txtnOfAssesments.getText().isEmpty() ||
                        credit.getText().isEmpty()){
                               
                               JOptionPane.showMessageDialog(null,"Please fill all the empty field");
                               return;
                        } 
                        else
                        {
                        int Duration = 0;
                        int noOfAssesments = 0;
                        try{
                        Duration = Integer.parseInt(txtduration.getText());
                        }
                        catch(Exception f){
                        
                        JOptionPane.showMessageDialog(null,"Invalid input");
                        return;
                        }
                        
                        try{
                            noOfAssesments = Integer.parseInt(txtnOfAssesments.getText());
                        
                        }
                        catch(Exception f){
                        JFrame af3 = new JFrame();
                        JOptionPane.showMessageDialog(af3,"Invalid input");
                        return;
                        }
                        String ID = txtcourseId.getText();
                        String Name = txtcourseName.getText();
                        String Level = txtlevel.getText();
                        String Credit = txtcredit.getText();
                        
                        for(int i=0;i<AcademicCourseList.size();i++){
                            if(AcademicCourseList.get(i).getcourseID().equals(ID)){
                                
                                JOptionPane.showMessageDialog(null,"Course ID already exists");
                                return;
                            
                            }
                        }
                        AcademicCourse ac = new AcademicCourse(ID,Name,Duration,Level,Credit,noOfAssesments);
                        AcademicCourseList.add(ac);
                        
                        JOptionPane.showMessageDialog(null,"Course successfully added!");
                        
                        }
                            
                        
                    }
                    });
                addBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                addBtn.setBackground(new Color(255, 102, 0));
                addBtn.setForeground(new Color(255, 255, 255));
                addBtn.setBounds(480, 385, 190, 50);
                frame1.getContentPane().add(addBtn);
                
                JButton btnRegister = new JButton("REGISTER");
                btnRegister.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(
                        txtlecturerName.getText().equals("")||
                        txtstartDate.getText().equals("")||
                        txtcourseLeader.getText().equals("") ||
                        txtcompletionDate.getText().equals("")){
                            
                            JOptionPane.showMessageDialog(null,"Empty field found");
                            return;
                        }
                        else{
                            String ACleader = txtcourseLeader.getText();
                            String ACcourseId = txtcourseId.getText();
                            String AClecturer = txtlecturerName.getText();
                            String ACstartingDate = txtstartDate.getText();
                            String ACcompletionDate = txtcompletionDate.getText();
                            
                        
                            for (int i = 0; i<AcademicCourseList.size(); i++){
                                if(AcademicCourseList.get(i).getcourseID().equals(ACcourseId)){
                                    AcademicCourse ac2 = (AcademicCourse) (AcademicCourseList.get(i));
                                    
                                    
                                    if(!ac2.getisRegistered()){
                                    ac2.register(ACleader,AClecturer,ACstartingDate, ACcompletionDate);
                                    
                                    
                                    JOptionPane.showMessageDialog(null,"Academic Course has been registered");
                                    return;
                                    }
                                    else{
                                        
                                        JOptionPane.showMessageDialog(null,"This Academic course has already been registered");
                                        return;
                                    }
                                
                                }
                            
                            }
                        
                    }
                      
                    }
                });
                btnRegister.setBackground(new Color(255, 102, 0));
                btnRegister.setForeground(new Color(255, 255, 255));
                btnRegister.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                btnRegister.setBounds(131, 618, 189, 50);
                frame1.getContentPane().add(btnRegister);
                
                JButton btnDisplay = new JButton("DISPLAY");
                btnDisplay.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       
                        if(
                        txtcourseName.getText().equals("") ||
                        txtcourseId.getText().equals("") ||
                        txtduration.getText().equals("") ||
                        txtlevel.getText().equals("")||
                        txtlecturerName.getText().equals("")||
                        txtnOfAssesments.getText().equals("")||
                        txtstartDate.getText().equals("")||
                        txtcourseLeader.getText().equals("")||
                        txtcompletionDate.getText().equals("")){
                            
                            JOptionPane.showMessageDialog(null,"Can't be displayed !! Try after registering the course");
                            return;
                        }
                        else{
                        
                        JOptionPane.showMessageDialog(null,"The Course ID is:"+txtcourseId.getText()+ 
                        "\nThe Course Name is:"+txtcourseName.getText()+
                        "\nThe Duration is:"+txtduration.getText()+
                        "\nThe Course Leader is:"+txtcourseLeader.getText()+
                        "\nThe prerequisite is:" + txtnOfAssesments.getText()+
                        "\nThe Exam Date is:"+txtlecturerName.getText()+
                        "\nThe Starting Date is:"+txtstartDate.getText()+
                        "\nThe Complete Date is:"+txtcompletionDate.getText()+
                        "\nThe Lecture Name is:"+txtlevel.getText()
                        );
                    }
                    
            
                    }
                });
                         
                   
                btnDisplay.setForeground(Color.WHITE);
                btnDisplay.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                btnDisplay.setBackground(new Color(255, 102, 0));
                btnDisplay.setBounds(467, 618, 189, 50);
                frame1.getContentPane().add(btnDisplay);
                
                JButton btnClear = new JButton("CLEAR");
                btnClear.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        txtcourseId.setText("");
                        txtcourseName.setText("");
                        txtlevel.setText("");
                        txtduration.setText("");
                        txtcredit.setText("");
                        txtnOfAssesments.setText("");
                        txtstartDate.setText("");
                        txtcompletionDate.setText("");
                        txtlecturerName.setText("");
                        txtcourseLeader.setText("");
                        
                    }
                });
                btnClear.setForeground(Color.WHITE);
                btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                btnClear.setBackground(new Color(255, 102, 0));
                btnClear.setBounds(838, 618, 189, 50);
                frame1.getContentPane().add(btnClear);
            
                
                JButton home = new JButton("HOME");
                home.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                home.setBackground(new Color(255, 102, 0));
                home.setForeground(new Color(255, 255, 255));
                home.setBounds(467, 695, 190, 50);
                frame1.getContentPane().add(home);
                home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                frame1.setVisible(false);
                
            }
            });
                


            }
        });
        
        //For non academic course
        
        JButton btnnac = new JButton("Non-Academic Course");
        btnnac.setBackground(new Color(255, 102, 0));
        btnnac.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
        btnnac.setBounds(428, 504, 309, 43);
        frame.getContentPane().add(btnnac);
        btnnac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                
                JFrame frame2 = new JFrame("Non-Academic Course Registration");
                frame2.getContentPane().setBackground(new Color(51, 51, 102));
                frame2.setBounds(100, 100, 1145,800);
                
                frame2.getContentPane().setLayout(null);
                frame2.setVisible(true);
                
                JPanel panel1 = new JPanel();
                panel1.setBackground(new Color(255, 102, 0));
                panel1.setBounds(0, 0, 1129, 65);
                frame2.getContentPane().add(panel1);
                
                JLabel title = new JLabel("Non-Academic Course Registration");
                title.setForeground(new Color(255, 255, 255));
                title.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
                panel1.add(title);
                
                JLabel nacwarning = new JLabel("!!! Please fill all the details correctly and click register to register your course !!!");
                nacwarning.setForeground(new Color(255, 255, 255));
                nacwarning.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
                nacwarning.setBounds(183, 74, 774, 21);
                frame2.getContentPane().add(nacwarning);
                
                JLabel nacCid = new JLabel("Course ID:");
                nacCid.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                nacCid.setForeground(new Color(255, 255, 255));
                nacCid.setBounds(99, 162, 129, 24);
                frame2.getContentPane().add(nacCid);
                
                JLabel naccName = new JLabel("Course Name:");
                naccName.setForeground(new Color(255, 255, 255));
                naccName.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                naccName.setBounds(645, 164, 161, 21);
                frame2.getContentPane().add(naccName);
                
                JLabel nacinsName = new JLabel("Instructor Name:");
                nacinsName.setForeground(new Color(255, 255, 255));
                nacinsName.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                nacinsName.setBounds(25, 372, 205, 21);
                frame2.getContentPane().add(nacinsName);
                
                JLabel nacldr = new JLabel("Course Leader:");
                nacldr.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                nacldr.setForeground(new Color(255, 255, 255));
                nacldr.setBounds(620, 372, 205, 21);
                frame2.getContentPane().add(nacldr);
                
                JLabel nacDur = new JLabel("Duration:");
                nacDur.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                nacDur.setForeground(new Color(255, 255, 255));
                nacDur.setBounds(102, 256, 129, 21);
                frame2.getContentPane().add(nacDur);
                
                JLabel nacpre = new JLabel("Prerequisites:");
                nacpre.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                nacpre.setForeground(new Color(255, 255, 255));
                nacpre.setBounds(645, 254, 173, 24);
                frame2.getContentPane().add(nacpre);
                
                JLabel nacsDate = new JLabel("Start Date:");
                nacsDate.setForeground(new Color(255, 255, 255));
                nacsDate.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                nacsDate.setBounds(95, 443, 142, 21);
                frame2.getContentPane().add(nacsDate);
                
                JLabel naccDate = new JLabel("Completion Date:");
                naccDate.setForeground(new Color(255, 255, 255));
                naccDate.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                naccDate.setBounds(588, 437, 230, 21);
                frame2.getContentPane().add(naccDate);
                
                 JLabel naceDate = new JLabel("Exam Date:");
                naceDate.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                naceDate.setForeground(new Color(255, 255, 255));
                naceDate.setBounds(95, 514, 142, 21);
                frame2.getContentPane().add(naceDate);
                
                JTextField nac_courseId = new JTextField();
                nac_courseId.setBounds(250, 156, 200, 30);
                frame2.getContentPane().add(nac_courseId);
                nac_courseId.setColumns(10);
                nac_courseId.setFont(font1);
                
                JTextField nac_courseName = new JTextField();
                nac_courseName.setColumns(10);
                nac_courseName.setBounds(838, 156, 200, 30);
                frame2.getContentPane().add(nac_courseName);
                nac_courseName.setFont(font1);
                
                JTextField nac_duration = new JTextField();
                nac_duration .setColumns(10);
                nac_duration .setBounds(250, 247, 200, 30);
                frame2.getContentPane().add(nac_duration );
                nac_duration.setFont(font1);
                
                JTextField nac_prerequisites = new JTextField();
                nac_prerequisites .setColumns(10);
                nac_prerequisites .setBounds(838, 247, 200, 30);
                frame2.getContentPane().add(nac_prerequisites );
                nac_prerequisites.setFont(font1);
                
                JTextField nac_instructorName = new JTextField();
                nac_instructorName.setColumns(10);
                nac_instructorName.setBounds(250, 366, 200, 30);
                frame2.getContentPane().add(nac_instructorName);
                nac_instructorName.setFont(font1);
                
                JTextField nac_courseLeader = new JTextField();
                nac_courseLeader.setColumns(10);
                nac_courseLeader.setBounds(838, 366, 200, 30);
                frame2.getContentPane().add(nac_courseLeader);
                nac_courseLeader.setFont(font1);
                
                JTextField nac_startDate = new JTextField();
                nac_startDate.setColumns(10);
                nac_startDate.setBounds(250, 434, 200, 30);
                frame2.getContentPane().add(nac_startDate);
                nac_startDate.setFont(font1);
                
                JTextField nac_completionDate = new JTextField();
                nac_completionDate.setColumns(10);
                nac_completionDate.setBounds(838, 434, 200, 30);
                frame2.getContentPane().add(nac_completionDate);
                nac_completionDate.setFont(font1);
                
                JTextField nac_examDate = new JTextField();
                nac_examDate.setColumns(10);
                nac_examDate.setBounds(250, 505, 200, 30);
                frame2.getContentPane().add(nac_examDate);
                nac_examDate.setFont(font1);
                
                
               
                
                
                
                JButton nacaddBtn = new JButton("ADD");
                nacaddBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(nac_courseId.getText().isEmpty() || 
                        nac_courseName.getText().isEmpty() ||
                        nac_duration.getText().isEmpty() ||
                        nac_prerequisites.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Please fill all the empty field");
                               return;
                        } 
                        else
                        {
                        int NAC_Duration = 0;
                        try{
                        NAC_Duration = Integer.parseInt(nac_duration.getText());
                        }
                        catch(Exception f){
                        JOptionPane.showMessageDialog(null,"Invalid input");
                        return;
                        }
                        String NAC_ID = nac_courseId.getText();
                        String NAC_Name = nac_courseName.getText();
                        String NAC_Prerequisites = nac_prerequisites.getText();
                        for(int i=0;i<AcademicCourseList.size();i++){
                            if(AcademicCourseList.get(i).getcourseID().equals(NAC_ID)){
                            
                                JOptionPane.showMessageDialog(null,"Course ID already exists");
                                return;
                            
                            }
                        }
                        NonAcademicCourse nac = new NonAcademicCourse(NAC_ID,NAC_Name,NAC_Duration,NAC_Prerequisites);
                        NonAcademicCourseList.add(nac);
                        JOptionPane.showMessageDialog(null,"Course successfully added!");
                        }
                    }
                    });
                nacaddBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
               nacaddBtn.setBackground(new Color(255, 102, 0));
               nacaddBtn.setForeground(new Color(255, 255, 255));
                nacaddBtn.setBounds(467, 290, 190, 50);
                frame2.getContentPane().add(nacaddBtn);
                
                JButton nacRegisterBtn = new JButton("REGISTER");
                nacRegisterBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(
                        nac_instructorName.getText().equals("")||
                        nac_startDate.getText().equals("")||
                        nac_courseLeader.getText().equals("")||
                        nac_completionDate.getText().equals("")||
                        nac_examDate.getText().equals("")){
                            
                            JOptionPane.showMessageDialog(null,"Empty field found");
                            return;
                        }
                        else{
                            String NACcourseId = nac_courseId.getText();
                            String NACcourseLeader = nac_courseLeader.getText();
                            String NACinstructorName = nac_instructorName.getText();
                            String NACstartDate = nac_startDate.getText();
                            String NACcompletionDate = nac_completionDate.getText();
                            
                            String NACexamDate = nac_completionDate.getText();
                            
                        
                            for (int i = 0; i<NonAcademicCourseList.size(); i++){
                                if(NonAcademicCourseList.get(i).getcourseID().equals(NACcourseId)){
                                    NonAcademicCourse nac = (NonAcademicCourseList.get(i));
                                    
                                    if(!nac.getisRegistered()){
                                    nac.registerNonAcademicCourse(NACcourseLeader,NACinstructorName,NACstartDate,NACcompletionDate,NACexamDate);
                                    JFrame af6 = new JFrame();
                                    JOptionPane.showMessageDialog(af6,"The Non-Academic Course has been registered");
                                    return;
                                    }
                                    else{
                                        
                                        JOptionPane.showMessageDialog(null,"The non-academic course has already been registered");
                                        return;
                                    }
                                
                                }
                            
                            }
                        
                    }
                      
                    }
                });
                nacRegisterBtn.setBackground(new Color(255, 102, 0));
               nacRegisterBtn.setForeground(new Color(255, 255, 255));
               nacRegisterBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
               nacRegisterBtn.setBounds(60, 619, 189, 50);
                frame2.getContentPane().add(nacRegisterBtn);
                
                JButton nacDisplayBtn = new JButton("DISPLAY");
                nacDisplayBtn.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if(
                        nac_courseName.getText().equals("") ||
                        nac_courseId.getText().equals("") ||
                        nac_duration.getText().equals("") ||
                        nac_prerequisites.getText().equals("") ||
                        nac_instructorName.getText().equals("")||
                        nac_startDate.getText().equals("")||
                        nac_courseLeader.getText().equals("")||
                        nac_completionDate.getText().equals("")||
                        nac_examDate.getText().equals("")){
                            
                            JOptionPane.showMessageDialog(null,"Empty field found");
                            return;
                        }
                        else{
                        
                        JOptionPane.showMessageDialog(null,"The Course ID is:"+nac_courseId.getText()+ 
                        "\nThe Course Name is:"+nac_courseName.getText()+
                        "\nThe Duration is:"+nac_duration.getText()+
                        "\nThe Starting Date is:"+nac_startDate.getText()+
                        "\nThe Complete Date is:"+nac_completionDate.getText()+
                        "\nThe Lecture Name is:"+nac_instructorName.getText()+
                        "\nThe Course Leader is:"+nac_courseLeader.getText()+
                        "\nThe prerequisite is:" + nac_prerequisites.getText()+
                        "\nThe Exam Date is:"+nac_examDate.getText());
                    }
                    
            
                    }
                });
                
                nacDisplayBtn.setForeground(Color.WHITE);
               nacDisplayBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                nacDisplayBtn.setBackground(new Color(255, 102, 0));
                nacDisplayBtn.setBounds(320, 619, 189, 50);
                frame2.getContentPane().add(nacDisplayBtn);
                
                JButton nacRemoveBtn = new JButton("REMOVE");
                 nacRemoveBtn.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    int db = JOptionPane.showConfirmDialog(null,"Do you want to remove the course?","Warning",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(db ==0){
                
                    if(
                        nac_instructorName.getText().equals("")||
                        nac_courseId.getText().isEmpty() || 
                        nac_courseName.getText().isEmpty() ||
                        
                        nac_duration.getText().isEmpty() ||
                        
                        nac_prerequisites.getText().isEmpty() ||
                        
                        nac_startDate.getText().equals("")||
                        nac_courseLeader.getText().equals("")||
                        nac_completionDate.getText().equals("")||
                        nac_examDate.getText().equals("")){
                            
                            JOptionPane.showMessageDialog(null,"Empty field found, Remove failed");
                            return;
                        }
                    
                    else{                    
                    // creating a local variable and storing the text field data
                    
                    String id = nac_courseId.getText();
                    String cLeader = nac_courseLeader.getText();
                    String instructorName = nac_instructorName.getText();
                    String startDate = nac_startDate.getText();
                    String completionDate = nac_completionDate.getText();
                    String examDate = nac_examDate.getText();
                    
                    for(int i = 0; i < NonAcademicCourseList.size(); i++){
                        //checking if the course id in the text fielkd matches to the one in the arraylist
                        if(NonAcademicCourseList.get(i).getcourseID().equals(id)){
                            //if the course id matches then storing that objects data in a newly created object of non academic course NAc
                            NonAcademicCourse NAC = (NonAcademicCourse)(NonAcademicCourseList.get(i));
                            //checking if the course is removed ot not
                            if(!NAC.getisRemoved()){
                                //if not removed then calling the remove method from the non acadmic course class
                                NAC.remove(cLeader,instructorName,startDate,completionDate, examDate);
                                JOptionPane.showMessageDialog(null, "The course with course ID "+ id + " has been removed successfully.");
                                nac_instructorName.setText("");
                                nac_courseId.setText("");
                                nac_courseName.setText("");
                                nac_duration.setText("");
                                nac_prerequisites.setText("");
                                nac_startDate.setText("");
                                nac_courseLeader.setText("");
                                nac_completionDate.setText("");
                                nac_examDate.setText("");
                                        
                                return;
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Course doesn't exist !! This Non-Academic Course has already been removed.");
                                return;
                            }
                        }
                        else{
                                JOptionPane.showMessageDialog(null, "course ID doesn't exists !!", "ALERT", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                    }
                }

            });
               nacRemoveBtn.setForeground(Color.WHITE);
                nacRemoveBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
               nacRemoveBtn.setBackground(new Color(255, 102, 0));
               nacRemoveBtn.setBounds(590, 619, 189, 50);
                frame2.getContentPane().add(nacRemoveBtn);
                
                
                
                JButton nacClearBtn= new JButton("CLEAR");
                nacClearBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        nac_courseId.setText("");
                        nac_courseName.setText("");
                        nac_duration.setText("");
                        nac_prerequisites.setText("");
                        nac_instructorName.setText("");
                        nac_startDate.setText("");
                        nac_completionDate.setText("");
                        nac_examDate.setText("");
                        nac_courseLeader.setText("");
                    }
                });
                nacClearBtn.setForeground(Color.WHITE);
                nacClearBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                nacClearBtn.setBackground(new Color(255, 102, 0));
                nacClearBtn.setBounds(850, 619, 189, 50);
                frame2.getContentPane().add(nacClearBtn);
                
                JButton home1 = new JButton("HOME");
                home1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                frame2.setVisible(false);
                
            }
            });
                home1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
                home1.setBackground(new Color(255, 102, 0));
                home1.setForeground(new Color(255, 255, 255));
                home1.setBounds(467, 695, 190, 50);
                frame2.getContentPane().add(home1);
                
                
            }

            
            
        });
        
        
        JButton btnExit = new JButton("Exit");
        btnExit.setBackground(new Color(255, 102, 0));
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int db = JOptionPane.showConfirmDialog(null,"Do you want to exit application?","Warning",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(db ==0){
                
                 System.exit(0);
                }
            }
        });
        btnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
        btnExit.setBounds(787, 504, 309, 43);
        frame.getContentPane().add(btnExit);
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(106, 90, 205));
        panel2.setBounds(53, 128, 317, 368);
        frame.getContentPane().add(panel2);
        panel2.setLayout(null);
        
        JLabel ingac = new JLabel("ING Academic Courses");
       ingac.setBounds(35, 8, 274, 37);
       ingac.setForeground(new Color(255, 255, 255));
       ingac.setFont(new Font("Perpetua", Font.BOLD, 25));
        panel2.add(ingac);
        
        JLabel s1 = new JLabel("i. Business Studies");
        s1.setForeground(new Color(255, 255, 255));
        s1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s1.setBounds(8, 76, 219, 24);
        panel2.add(s1);
        
        JLabel s2 = new JLabel("ii. Technology Studies");
       s2.setForeground(new Color(255, 255, 255));
       s2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
       s2.setBounds(8, 123, 219, 18);
        panel2.add(s2);
        
        JLabel s3 = new JLabel("iii. Management Studies");
        s3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s3.setForeground(new Color(255, 255, 255));
        s3.setBounds(8, 169, 241, 18);
        panel2.add(s3);
        
        JLabel s4 = new JLabel("iv. Engineering Studies");
        s4.setForeground(Color.WHITE);
        s4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s4.setBounds(8, 213, 241, 18);
        panel2.add(s4);
        
        JLabel s5 = new JLabel("v. BIT");
        s5.setForeground(Color.WHITE);
        s5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s5.setBounds(8, 261, 241, 18);
        panel2.add(s5);
        
        JLabel s6 = new JLabel("vi. BSc CSIt");
        s6.setForeground(Color.WHITE);
        s6.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s6.setBounds(8, 306, 241, 18);
        panel2.add(s6);
        
        JLabel line = new JLabel("***********************************");
        line.setForeground(new Color(255, 255, 255));
        line.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        line.setBounds(0, 41, 317, 18);
        panel2.add(line);
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(106, 90, 205));
        panel3.setBounds(428, 128, 309, 368);
        frame.getContentPane().add(panel3);
        panel3.setLayout(null);
        
        JLabel s7 = new JLabel("ING Non-Academic Courses");
        s7.setBounds(6, 5, 296, 30);
        s7.setForeground(new Color(255, 255, 255));
        s7.setFont(new Font("Perpetua", Font.BOLD, 25));
        panel3.add(s7);
        
        JLabel s8 = new JLabel("i. Physical Education");
        s8.setForeground(Color.WHITE);
        s8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s8.setBounds(8, 78, 219, 31);
        panel3.add(s8);
        
        JLabel s9 = new JLabel("ii. Music");
        s9.setForeground(Color.WHITE);
        s9.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s9.setBounds(8, 117, 219, 30);
        panel3.add(s9);
        
        JLabel s10 = new JLabel("iii. Art");
        s10.setForeground(Color.WHITE);
        s10.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s10.setBounds(6, 160, 219, 38);
        panel3.add(s10);
        
        JLabel s11 = new JLabel("iv. Public Speaking");
        s11.setForeground(Color.WHITE);
        s11.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s11.setBounds(8, 206, 219, 31);
        panel3.add(s11);
        
        JLabel s12 = new JLabel("v. Public Relation ");
        s12.setForeground(Color.WHITE);
        s12.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s12.setBounds(6, 245, 219, 31);
        panel3.add(s12);
        
        JLabel line_1 = new JLabel("***********************************");
        line_1.setForeground(Color.WHITE);
        line_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        line_1.setBounds(0, 43, 309, 18);
        panel3.add(line_1);
        
        JPanel panel4= new JPanel();
        panel4.setBackground(new Color(106, 90, 205));
        panel4.setBounds(787, 128, 309, 368);
        frame.getContentPane().add(panel4);
        panel4.setLayout(null);
        
        JLabel s13 = new JLabel("Thank you for choosing us.");
        s13.setBounds(10, 5, 288, 30);
        s13.setForeground(new Color(255, 255, 255));
        s13.setFont(new Font("Perpetua", Font.BOLD, 25));
        panel4.add(s13);
        
        JLabel s14 = new JLabel("If you have any queries ");
        s14.setForeground(new Color(255, 255, 255));
        s14.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s14.setBounds(34, 72, 264, 38);
        panel4.add(s14);
        
        JLabel s15 = new JLabel("Please feel free to contact.");
        s15.setForeground(new Color(255, 255, 255));
        s15.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s15.setBounds(23, 118, 264, 24);
        panel4.add(s15);
        
        JLabel s16 = new JLabel("Admission Incharge");
        s16.setForeground(new Color(255, 255, 255));
        s16.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s16.setBounds(67, 176, 208, 30);
        panel4.add(s16);
        
        JLabel s17 = new JLabel("Mr. Thomas Shelby");
        s17.setForeground(new Color(255, 255, 255));
        s17.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s17.setBounds(67, 215, 195, 24);
        panel4.add(s17);
        
        JLabel s18 = new JLabel("01-0425564");
        s18.setForeground(new Color(255, 255, 255));
        s18.setFont(new Font("Tahoma", Font.BOLD, 20));
        s18.setBounds(89, 254, 176, 24);
        panel4.add(s18);
        
        JLabel line_2 = new JLabel("***********************************");
        line_2.setForeground(Color.WHITE);
        line_2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        line_2.setBounds(-3, 43, 312, 18);
        panel4.add(line_2);
        
        JLabel s19 = new JLabel("Kamal Marg, Kamal Pokhari, Kathmandu, Nepal");
        s19.setForeground(new Color(255, 255, 255));
        s19.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s19.setBounds(344, 628, 446, 24);
        frame.getContentPane().add(s19);
        
        JLabel s20 = new JLabel("Tel : 4512929, 980-1022446");
        s20.setForeground(new Color(255, 255, 255));
        s20.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s20.setBounds(428, 660, 278, 22);
        frame.getContentPane().add(s20);
        
        JLabel s21 = new JLabel("Whatsapp & Viber Number: 9801000400");
        s21.setForeground(new Color(255, 255, 255));
        s21.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s21.setBounds(375, 690, 385, 22);
        frame.getContentPane().add(s21);
        
        JLabel s22 = new JLabel("Email : info@islington.edu.np  ");
        s22.setForeground(new Color(255, 255, 255));
        s22.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        s22.setBounds(443, 720, 317, 22);
        frame.getContentPane().add(s22);
        
        JPanel panel5 = new JPanel();
        panel5.setBackground(new Color(255, 102, 51));
        panel5.setBounds(0, 0, 1139, 63);
        frame.getContentPane().add(panel5);
        
        JLabel title1 = new JLabel("Welcome to ING Course registration portal");
        title1.setForeground(new Color(255, 255, 255));
        title1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
        panel5.add(title1);
        
        JLabel s23 = new JLabel("\u00A9 2021 Sugam Dangal, All rights reserved");
        s23.setFont(new Font("Trebuchet MS", Font.BOLD, 9));
        s23.setForeground(new Color(255, 255, 255));
        s23.setBounds(8, 744, 194, 17);
        frame.getContentPane().add(s23);
        
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
    }

     

        
        
    
     
    public static void main(String[ ] args) {
    try {
      new INGCollege();
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
    
    }
    
    
    
    
    
    
    

    

        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
