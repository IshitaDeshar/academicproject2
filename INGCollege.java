import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.*;

public class INGCollege implements ActionListener
{
    //Declaring instance variable

    private JPanel pp, pp1, p_1 , p_2 , p_3 , p_4;

    private JLabel label_1, label_CourseID, label_CourseName, label_Duration, label_Level, label_Credit, label_Assessment,
    label_Courseleader, label_LecturerName, label_StartingDate, label_CompletionDate, label_2, label_CourseID1, label_CourseName1, 
    label_Duration1, label_Prerequisite, label_Courseleader1, label_InstructorName, label_StartingDate1, label_CompletionDate1,
    label_ExamDate;
 
    private JTextField field_CourseID, field_CourseName, field_Duration, field_Level, field_Credit, field_Assessment, field_Courseleader,
    field_LecturerName, field_CourseID1, field_CourseName1, field_Duration1, field_Prerequisite, field_Courseleader1, field_InstructorName;

    private JButton button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_10, button_11;

    private JComboBox js1, js2, js3, js4, js5, js6, js7, js8, js9, js10, js11, js12, js13, js14, js15;

    private JFrame f_1,f_2;

    public static INGCollege sf = new INGCollege();

    //objects for academic course
    public static AcademicCourse object_academic;

    //Declare of ArrayList
    public ArrayList<Course> alist = new ArrayList<Course>();
    private String add_CourseID, add_CourseName, add_Duration ,add_Level,
    add_Credit, add_Assessment;
    private int a_duration, a_assessment;

    private AcademicCourse AC;
    private JOptionPane msg1;
    private String final_msg1;
    private String register_CourseID, register_Courseleader, register_LecturerName, register_StartingDate, register_CompletionDate;

    //objects for non-academic course
    public static NonAcademicCourse object_nonacademic;

    private String add_CourseID1, add_CourseName1, add_Duration1 ,add_Prerequisite;
    private int a_duration1;
    private NonAcademicCourse NAC;
    private JOptionPane msg2;
    private String final_msg2;
    private String register_CourseID1, register_Courseleader1, register_InstructorName, register_StartingDate1, register_CompletionDate1, register_ExamDate1;
    private boolean hello, helloo;
    private boolean isDVno, isDVno1;

    // public static NonAcademicCourse ObjNonAcademic;
    // private String txtNonAcademic;
    // private String remove_CourseID;

    public void createGUI()
    {
        //FIRST FRAME
        f_1 = new JFrame();
        f_1.setTitle("Course Registration");
        f_1.setBounds(55,50,955,700);

        //layout set to null
        f_1.setLayout(null);

        
        //1st Panel
        pp = new JPanel();
        pp.setBounds(0,0,955,700);
        //Setting Color to Panel
        Color color_panel1 = new Color(255, 204, 153);
        pp.setBackground(color_panel1);
        pp.setLayout(null);


        //2st Panel
        p_1 = new JPanel();
        p_1.setBounds(45,170,400,400);
        //Setting Color to Panel
        Color c = new Color(255, 179, 102);
        p_1.setBackground(c);
        p_1.setLayout(null);


        //3nd Panel
        p_2 = new JPanel();
        p_2.setBounds(485,170,400,400);
        //Setting Color to Panel
        Color c_1 = new Color(255, 179, 102);
        p_2.setBackground(c_1);
        p_2.setLayout(null);


        f_1.add(p_1);
        f_1.add(p_2);
        f_1.add(pp);


        //JLabel --> Academic Course
        label_1 = new JLabel();
        label_1.setText("ACADEMIC COURSE");
        label_1.setForeground(new Color(153, 79, 0));
        label_1.setBounds(270, 50, 450, 50);
        pp.add(label_1);

        //Setting Font to JLabel
        Font ff_1 = new Font("Tw Cen MT",Font.BOLD,50);
        label_1.setFont(ff_1);
        pp.add(label_1);


        //JLabel --> Course ID
        label_CourseID = new JLabel("Course ID:");
        label_CourseID.setBounds(30, 30, 100, 40);

        //Setting Font to JLabel
        Font font_CourseID = new Font("Arial" , Font.PLAIN , 16);
        label_CourseID.setFont(font_CourseID);
        p_1.add(label_CourseID);

        //JTextField for Course ID
        field_CourseID = new JTextField();
        field_CourseID.setBounds(185, 35, 170, 30);

        //Setting Color to JTextField
        Color color_CourseID = new Color(255, 243, 230);
        field_CourseID.setBackground(color_CourseID);
        p_1.add(field_CourseID);


        //JLabel --> Course Name
        label_CourseName = new JLabel("Course Name:");
        label_CourseName.setBounds(30, 80, 150, 40);

        //Setting Font to JLabel
        Font font_CourseName = new Font("Arial" , Font.PLAIN , 16);
        label_CourseName.setFont(font_CourseName);
        p_1.add(label_CourseName);

        //JTextField for Course Name
        field_CourseName = new JTextField();
        field_CourseName.setBounds(185, 85, 170, 30);

        //Setting Color to JTextField
        Color color_CourseName = new Color(255, 243, 230);
        field_CourseName.setBackground(color_CourseName);
        p_1.add(field_CourseName);


        //JLabel --> Duration
        label_Duration = new JLabel("Duration:");
        label_Duration.setBounds(30, 130, 150, 40);

        //Setting Font to JLabel
        Font font_Duration = new Font("Arial" , Font.PLAIN , 16);
        label_Duration.setFont(font_Duration);
        p_1.add(label_Duration);

        //JTextField for Duration
        field_Duration = new JTextField();
        field_Duration.setBounds(185, 135, 170, 30);

        //Setting Color to JTextField
        Color color_Duration = new Color(255, 243, 230);
        field_Duration.setBackground(color_Duration);
        p_1.add(field_Duration);


        //JLabel --> Level
        label_Level = new JLabel("Level:");
        label_Level.setBounds(30, 180, 100, 40);

        //Setting Font to JLabel
        Font font_Level = new Font("Arial" , Font.PLAIN , 16);
        label_Level.setFont(font_Level);
        p_1.add(label_Level);

        //JTextField for Level
        field_Level = new JTextField();
        field_Level.setBounds(185, 185, 170, 30);

        //Setting Color to JTextField
        Color color_Level = new Color(255, 243, 230);
        field_Level.setBackground(color_Level);
        p_1.add(field_Level);


        //JLabel --> Credit
        label_Credit = new JLabel("Credit:");
        label_Credit.setBounds(30, 230, 100, 40);

        //Setting Font to JLabel
        Font font_Credit = new Font("Arial" , Font.PLAIN , 16);
        label_Credit.setFont(font_Credit);
        p_1.add(label_Credit);

        //JTextField for Credit
        field_Credit = new JTextField();
        field_Credit.setBounds(185, 235, 170, 30);

        //Setting Color to JTextField
        Color color_Credit = new Color(255, 243, 230);
        field_Credit.setBackground(color_Credit);
        p_1.add(field_Credit);


        //JLabel --> Number of Assessments
        label_Assessment = new JLabel("Number of Assessment:");
        label_Assessment.setBounds(30, 280, 200, 40);

        //Setting Font to JLabel
        Font font_Assessment = new Font("Arial" , Font.PLAIN , 16);
        label_Assessment.setFont(font_Assessment);
        p_1.add(label_Assessment);

        //JTextField for Number of Assessment
        field_Assessment = new JTextField();
        field_Assessment.setBounds(233, 285, 120, 30);

        //Setting Color to JTextField
        Color color_Assessment = new Color(255, 243, 230);
        field_Assessment.setBackground(color_Assessment);
        p_1.add(field_Assessment);


        //Button --> Add Course for Academic Course
        button_1 = new JButton("Add Course for Academic Course");
        button_1.setBounds(30, 335, 327, 30);

        //Setting Color to Button
        Color color_academic = new Color(255, 230, 204);
        button_1.setBackground(color_academic);
        //register listener
        button_1.addActionListener(this);//passing current instance
        p_1.add(button_1);

        //Setting Font to JButton
        Font font_1 = new Font("Arial", Font.BOLD, 15);
        button_1.setFont(font_1);
        p_1.add(button_1);


        //JLabel --> Course Leader
        label_Courseleader = new JLabel("Course Leader:");
        label_Courseleader.setBounds(30, 30, 200, 40);

        //Setting Font to JLabel
        Font font_Courseleader = new Font("Arial" , Font.PLAIN , 16);
        label_Courseleader.setFont(font_Courseleader);
        p_2.add(label_Courseleader);

        //JTextField for Course Leader
        field_Courseleader = new JTextField();
        field_Courseleader.setBounds(185, 35, 170, 30);

        //Setting Color to JTextField
        Color color_Courseleader = new Color(255, 243, 230);
        field_Courseleader.setBackground(color_Courseleader);
        p_2.add(field_Courseleader);


        //JLabel --> Lecturer Name
        label_LecturerName = new JLabel("Lecturer Name:");
        label_LecturerName.setBounds(30, 80, 150, 40);

        //Setting Font to JLabel
        Font font_LecturerName = new Font("Arial" , Font.PLAIN , 16);
        label_LecturerName.setFont(font_LecturerName);
        p_2.add(label_LecturerName);

        //JTextField for Lecturer Name
        field_LecturerName = new JTextField();
        field_LecturerName.setBounds(185, 85, 170, 30);

        //Setting Color to JTextField
        Color color_LecturerName = new Color(255, 243, 230);
        field_LecturerName.setBackground(color_LecturerName);
        p_2.add(field_LecturerName);


        //JLabel --> Starting Date
        label_StartingDate = new JLabel("Starting Date:");
        label_StartingDate.setBounds(30, 130, 150, 40);

        //Setting Font to JLabel
        Font font_StartingDate = new Font("Arial" , Font.PLAIN , 16);
        label_StartingDate.setFont(font_StartingDate);
        p_2.add(label_StartingDate);

        //JComboBox --> Starting Date
        String[] year_1 = {"1995","1996","1997","1998","1999","2000","2001"
            ,"2002","2003","2004","2005","2006","2007","2008","2009","2010"
            ,"2011","2012","2013","2014","2015","2016","2017","2018","2019"
            ,"2020","2021"};
        js1 = new JComboBox(year_1);
        js1.setBounds(185, 135, 60, 30);
        //Setting Color to JComboBox
        Color color_year1 = new Color(255, 230, 204);
        js1.setBackground(color_year1);
        p_2.add(js1);

        //JComboBox --> Starting Date
        String[] month_1 = {"January","Feburary","March","April","May","June","July"
            ,"August","September","October","November","December"};
        js2 = new JComboBox(month_1);
        js2.setBounds(250, 135, 75, 30);
        //Setting Color to JComboBox
        Color color_month1 = new Color(255, 230, 204);
        js2.setBackground(color_month1);
        p_2.add(js2);

        //JComboBox --> Starting Date
        String[] day_1 = {"01","02","03","04","05","06","07"
            ,"08","09","10","11","12","13","14","15","16"
            ,"17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31"};
        js3 = new JComboBox(day_1);
        js3.setBounds(330, 135, 45, 30);
        //Setting Color to JComboBox
        Color color_day1 = new Color(255, 230, 204);
        js3.setBackground(color_day1);
        p_2.add(js3);

        //JLabel --> Completion Date
        label_CompletionDate = new JLabel("Completion Date:");
        label_CompletionDate.setBounds(30, 180, 200, 40);

        //Setting Font to JLabel
        Font font_CompletionDate = new Font("Arial" , Font.PLAIN , 16);
        label_CompletionDate.setFont(font_CompletionDate);
        p_2.add(label_CompletionDate);

        //JComboBox --> Completion Date
        String[] year_2 = {"1995","1996","1997","1998","1999","2000","2001"
            ,"2002","2003","2004","2005","2006","2007","2008","2009","2010"
            ,"2011","2012","2013","2014","2015","2016","2017","2018","2019"
            ,"2020","2021"};
        js4 = new JComboBox(year_2);
        js4.setBounds(185, 185, 60, 30);
        //Setting Color to JComboBox
        Color color_year2 = new Color(255, 230, 204);
        js4.setBackground(color_year2);
        p_2.add(js4);

        //JComboBox --> Completion Date
        String[] month_2 = {"January","Feburary","March","April","May","June","July"
            ,"August","September","October","November","December"};
        js5 = new JComboBox(month_2);
        js5.setBounds(250, 185, 75, 30);
        //Setting Color to JComboBox
        Color color_month2 = new Color(255, 230, 204);
        js5.setBackground(color_month2);
        p_2.add(js5);

        //JComboBox --> Completion Date
        String[] day_2 = {"01","02","03","04","05","06","07"
            ,"08","09","10","11","12","13","14","15","16"
            ,"17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31"};
        js6 = new JComboBox(day_2);
        js6.setBounds(330, 185, 45, 30);
        //Setting Color to JComboBox
        Color color_day2 = new Color(255, 230, 204);
        js6.setBackground(color_day2);
        p_2.add(js6);


        //Button --> Register Academic Course
        button_2 = new JButton("Register Academic Course");
        button_2.setBounds(30, 235, 327, 30);

        //Setting Color to JButton
        Color color_registeracademic = new Color(255, 230, 204);
        button_2.setBackground(color_registeracademic);
        button_2.addActionListener(this);//it implements keyword to the class definition
        p_2.add(button_2);

        //Setting Font to JButton
        Font font_2 = new Font("Arial", Font.BOLD, 15);
        button_2.setFont(font_2);
        p_2.add(button_2);


        //Button --> Display
        button_3 = new JButton("Display");
        button_3.setBounds(30, 285, 155, 40);

        //Setting Color to JButton
        Color color_display = new Color(191, 255, 128);
        button_3.setBackground(color_display);
        button_3.addActionListener(this);//it implements keyword to the class definition
        p_2.add(button_3);

        //Setting font to JButton
        Font font_3 = new Font("Arial", Font.BOLD, 15);
        button_3.setFont(font_3);
        p_2.add(button_3);


        //Button --> Clear
        button_4 = new JButton("Clear");
        button_4.setBounds(205, 285, 155, 40);

        //Setting Color to JButton
        Color color_clear = new Color(255, 112, 77);
        button_4.setBackground(color_clear);
        button_4.addActionListener(this);//it implements keyword to the class definition
        p_2.add(button_3);

        //Setting font to JButton
        Font font_4 = new Font("Arial", Font.BOLD, 15);
        button_4.setFont(font_4);
        p_2.add(button_4);


        //Button --> Change for Non-Academic Course
        button_5 = new JButton("Change for Non-Academic Course");
        button_5.setBounds(30, 340, 327, 30);

        //Setting Color to JButton
        Color color_change1 = new Color(255, 230, 204);
        button_5.setBackground(color_change1);
        button_5.addActionListener(this);//it implements keyword to the class definition
        p_2.add(button_5);

        //Setting font to JButton
        Font font_5 = new Font("Arial", Font.BOLD, 15);
        button_5.setFont(font_5);
        p_2.add(button_5);


        f_1.setVisible(true);//setting visible to frame
        f_1.setResizable(false);//setting frame resizable to false
    }

    public void secondframe()
    { 

        //SECOND FRAME
        f_2 = new JFrame();
        f_2.setTitle("Course Registration");
        f_2.setBounds(55,50,955,700);

        //layout set to null
        f_2.setLayout(null);

        
        //4th Panel
        pp1 = new JPanel();
        pp1.setBounds(0,0,955,700);
        //Setting Color to panel
        Color color_panel1 = new Color(255, 204, 153);
        pp1.setBackground(color_panel1);
        pp1.setLayout(null);


        //5th Panel
        p_3 = new JPanel();
        p_3.setBounds(45,220,400,350);
        //Setting Color to panel
        Color c_2 = new Color(255, 179, 102);
        p_3.setBackground(c_2);
        p_3.setLayout(null);


        //2nd panel
        p_4 = new JPanel();
        p_4.setBounds(485,170,400,440);
        //Setting Color to panel
        Color c_3 = new Color(255, 179, 102);
        p_4.setBackground(c_3);
        p_4.setLayout(null);


        f_2.add(p_3);
        f_2.add(p_4);
        f_2.add(pp1);


        //JLabel --> Non-Academic Course
        label_2 = new JLabel();
        label_2.setText("NON-ACADEMIC COURSE");
        label_2.setForeground(new Color(153, 79, 0));
        label_2.setBounds(200, 50, 550, 50);
        f_2.add(label_2);

        //Setting Font to JLabel
        Font ff_2 = new Font("Tw Cen MT",Font.BOLD,50);
        label_2.setFont(ff_2);
        pp1.add(label_2);


        //JLabel --> Course ID
        label_CourseID1 = new JLabel("Course ID:");
        label_CourseID1.setBounds(30, 30, 100, 40);

        //Setting Font to JLabel
        Font font_CourseID1 = new Font("Arial" , Font.PLAIN , 16);
        label_CourseID1.setFont(font_CourseID1);
        p_3.add(label_CourseID1);

        //JTextField for CourseID1
        field_CourseID1 = new JTextField();
        field_CourseID1.setBounds(185, 35, 170, 30);

        //Setting Color to JTextField
        Color color_CourseID1 = new Color(255, 243, 230);
        field_CourseID1.setBackground(color_CourseID1);
        p_3.add(field_CourseID1);


        //JLabel --> Course Name
        label_CourseName1 = new JLabel("Course Name:");
        label_CourseName1.setBounds(30, 80, 150, 40);

        //Setting Font to JLabel
        Font font_CourseName1 = new Font("Arial" , Font.PLAIN , 16);
        label_CourseName1.setFont(font_CourseName1);
        p_3.add(label_CourseName1);

        //JTextField for Course Name
        field_CourseName1 = new JTextField();
        field_CourseName1.setBounds(185, 85, 170, 30);

        //Setting Color to JTextField
        Color color_CourseName1 = new Color(255, 243, 230);
        field_CourseName1.setBackground(color_CourseName1);
        p_3.add(field_CourseName1);


        //JLabel --> Duration
        label_Duration1 = new JLabel("Duration:");
        label_Duration1.setBounds(30, 130, 150, 40);

        //Setting Font to JLabel
        Font font_Duration1 = new Font("Arial" , Font.PLAIN , 16);
        label_Duration1.setFont(font_Duration1);
        p_3.add(label_Duration1);

        //JTextField for Duration
        field_Duration1 = new JTextField();
        field_Duration1.setBounds(185, 135, 170, 30);

        //Setting Color to JTextField
        Color color_Duration1 = new Color(255, 243, 230);
        field_Duration1.setBackground(color_Duration1);
        p_3.add(field_Duration1);


        //JLabel --> Prerequisite
        label_Prerequisite = new JLabel("Prerequisite:");
        label_Prerequisite.setBounds(30, 180, 100, 40);

        //Setting Font to JLabel
        Font font_Prerequisite = new Font("Arial" , Font.PLAIN , 16);
        label_Prerequisite.setFont(font_Prerequisite);
        p_3.add(label_Prerequisite);

        //JTextField for Prerequisite
        field_Prerequisite = new JTextField();
        field_Prerequisite.setBounds(185, 185, 170, 30);

        //Setting Color to JTextField
        Color color_Prerequisite = new Color(255, 243, 230);
        field_Prerequisite.setBackground(color_Prerequisite);
        p_3.add(field_Prerequisite);


        //Button --> Add Course for Non-Academic Course
        button_6 = new JButton("Add Course for Non-Academic Course");
        button_6.setBounds(30, 235, 327, 30);

        //Setting Color to JButton
        Color color_nonacademic = new Color(255, 230, 204);
        button_6.setBackground(color_nonacademic);
        button_6.addActionListener(this);//it implements keyword to the class definition
        p_3.add(button_6);

        //Setting Font to JButton
        Font font_6 = new Font("Arial", Font.BOLD, 15);
        button_6.setFont(font_6);
        p_3.add(button_6);


        //Button --> Remove Non-Academic Course
        button_7 = new JButton("Remove Non-Academic Course");
        button_7.setBounds(30, 285, 327, 30);

        //Setting Color to JButton
        Color color_remove = new Color(255, 230, 204);
        button_7.setBackground(color_remove);
        button_7.addActionListener(this);//it implements keyword to the class definition
        p_3.add(button_7);

        //Setting Font to JButton
        Font font_7 = new Font("Arial", Font.BOLD, 15);
        button_7.setFont(font_7);
        p_3.add(button_7);


        //JLabel --> Course Leader
        label_Courseleader1 = new JLabel("Course Leader:");
        label_Courseleader1.setBounds(30, 30, 200, 40);

        //Setting Font to JLabel
        Font font_Courseleader1 = new Font("Arial" , Font.PLAIN , 16);
        label_Courseleader1.setFont(font_Courseleader1);
        p_4.add(label_Courseleader1);

        //JTextField for Course Leader
        field_Courseleader1 = new JTextField();
        field_Courseleader1.setBounds(185, 35, 170, 30);

        //Setting Color to JTextField
        Color color_Courseleader1 = new Color(255, 243, 230);
        field_Courseleader1.setBackground(color_Courseleader1);
        p_4.add(field_Courseleader1);


        //JLabel --> Instructor Name
        label_InstructorName = new JLabel("Instructor Name:");
        label_InstructorName.setBounds(30, 80, 150, 40);

        //Setting Font to JLabel
        Font font_InstructorName = new Font("Arial" , Font.PLAIN , 16);
        label_InstructorName.setFont(font_InstructorName);
        p_4.add(label_InstructorName);

        //JTextField for Instructor Name
        field_InstructorName = new JTextField();
        field_InstructorName.setBounds(185, 85, 170, 30);

        //Setting Color to JTextField
        Color color_InstructorName = new Color(255, 243, 230);
        field_InstructorName.setBackground(color_InstructorName);
        p_4.add(field_InstructorName);


        //JLabel --> Starting Date
        label_StartingDate1 = new JLabel("Starting Date:");
        label_StartingDate1.setBounds(30, 130, 150, 40);

        //Setting Font to JLabel
        Font font_StartingDate1 = new Font("Arial" , Font.PLAIN , 16);
        label_StartingDate1.setFont(font_StartingDate1);
        p_4.add(label_StartingDate1);

        //JComboBox --> Starting Date
        String[] year_3 = {"1995","1996","1997","1998","1999","2000","2001"
            ,"2002","2003","2004","2005","2006","2007","2008","2009","2010"
            ,"2011","2012","2013","2014","2015","2016","2017","2018","2019"
            ,"2020","2021"};
        js7 = new JComboBox(year_3);
        js7.setBounds(185, 135, 60, 30);
        //Setting Color to JComboBox
        Color color_year3 = new Color(255, 230, 204);
        js7.setBackground(color_year3);
        p_4.add(js7);

        //JComboBox --> Starting Date
        String[] month_3 = {"January","Feburary","March","April","May","June","July"
            ,"August","September","October","November","December"};
        js8 = new JComboBox(month_3);
        js8.setBounds(250, 135, 75, 30);
        //Setting Color to JComboBox
        Color color_month3 = new Color(255, 230, 204);
        js8.setBackground(color_month3);
        p_4.add(js8);

        //JComboBox --> Starting Date
        String[] day_3 = {"01","02","03","04","05","06","07"
            ,"08","09","10","11","12","13","14","15","16"
            ,"17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31"};
        js9 = new JComboBox(day_3);
        js9.setBounds(330, 135, 45, 30);
        //Setting Color to JComboBox
        Color color_day3 = new Color(255, 230, 204);
        js9.setBackground(color_day3);
        p_4.add(js9);


        //JLabel --> Completion Date
        label_CompletionDate1 = new JLabel("Completion Date:");
        label_CompletionDate1.setBounds(30, 180, 200, 40);

        //Setting Font to JLabel
        Font font_CompletionDate1 = new Font("Arial" , Font.PLAIN , 16);
        label_CompletionDate1.setFont(font_CompletionDate1);
        p_4.add(label_CompletionDate1);

        //JComboBox --> Completion Date
        String[] year_4 = {"1995","1996","1997","1998","1999","2000","2001"
            ,"2002","2003","2004","2005","2006","2007","2008","2009","2010"
            ,"2011","2012","2013","2014","2015","2016","2017","2018","2019"
            ,"2020","2021"};
        js10 = new JComboBox(year_4);
        js10.setBounds(185, 185, 60, 30);
        //Setting Color to JComboBox
        Color color_year4 = new Color(255, 230, 204);
        js10.setBackground(color_year4);
        p_4.add(js10);

        //JComboBox --> Completion Date
        String[] month_4 = {"January","Feburary","March","April","May","June","July"
            ,"August","September","October","November","December"};
        js11 = new JComboBox(month_4);
        js11.setBounds(250, 185, 75, 30);
        //Setting Color to JComboBox
        Color color_month4 = new Color(255, 230, 204);
        js11.setBackground(color_month4);
        p_4.add(js11);

        //JComboBox --> Completion Date
        String[] day_4 = {"01","02","03","04","05","06","07"
            ,"08","09","10","11","12","13","14","15","16"
            ,"17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31"};
        js12 = new JComboBox(day_4);
        js12.setBounds(330, 185, 45, 30);
        //Setting Color to JComboBox
        Color color_day4 = new Color(255, 230, 204);
        js12.setBackground(color_day4);
        p_4.add(js12);


        //JLabel --> Exam Date
        label_ExamDate = new JLabel("Exam Date:");
        label_ExamDate.setBounds(30, 230, 200, 40);

        //Setting Font to JLabel
        Font font_ExamDate = new Font("Arial" , Font.PLAIN , 16);
        label_ExamDate.setFont(font_ExamDate);
        p_4.add(label_ExamDate);

        //JComboBox --> Exam Date
        String[] year_5 = {"1995","1996","1997","1998","1999","2000","2001"
            ,"2002","2003","2004","2005","2006","2007","2008","2009","2010"
            ,"2011","2012","2013","2014","2015","2016","2017","2018","2019"
            ,"2020","2021"};
        js13 = new JComboBox(year_5);
        js13.setBounds(185, 235, 60, 30);
        //Setting Color to JComboBox
        Color color_year5 = new Color(255, 230, 204);
        js13.setBackground(color_year5);
        p_4.add(js13);

        //JComboBox --> Exam Date
        String[] month_5 = {"January","Feburary","March","April","May","June","July"
            ,"August","September","October","November","December"};
        js14 = new JComboBox(month_5);
        js14.setBounds(250, 235, 75, 30);
        //Setting Color to JComboBox
        Color color_month5 = new Color(255, 230, 204);
        js14.setBackground(color_month5);
        p_4.add(js14);

        //JComboBox --> Exam Date
        String[] day_5 = {"01","02","03","04","05","06","07"
            ,"08","09","10","11","12","13","14","15","16"
            ,"17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31"};
        js15 = new JComboBox(day_5);
        js15.setBounds(330, 235, 45, 30);
        //Setting Color to JComboBox
        Color color_day5 = new Color(255, 230, 204);
        js15.setBackground(color_day5);
        p_4.add(js15);


        //Button --> Register Non-Academic Course
        button_8 = new JButton("Register Non-Academic Course");
        button_8.setBounds(30, 285, 327, 30);

        //Setting Color to JButton
        Color color_registernonacademic = new Color(255, 230, 204);
        button_8.setBackground(color_registernonacademic);
        button_8.addActionListener(this);//it implements keyword to the class definition
        p_4.add(button_8);

        //Setting font to JButton
        Font font_8 = new Font("Arial", Font.BOLD, 15);
        button_8.setFont(font_8);
        p_4.add(button_8);


        //Button --> Display
        button_9 = new JButton("Display");
        button_9.setBounds(30, 335, 155, 40);

        //Setting Color to JButton
        Color color_display1 = new Color(191, 255, 128);
        button_9.setBackground(color_display1);
        button_9.addActionListener(this);//it implements keyword to the class definition
        p_4.add(button_9);

        //Setting font to JButton
        Font font_9 = new Font("Arial", Font.BOLD, 15);
        button_9.setFont(font_9);
        p_4.add(button_9);


        //Button --> Clear
        button_10 = new JButton("Clear");
        button_10.setBounds(205, 335, 155, 40);

        //Setting Color to JButton
        Color color_clear1 = new Color(255, 112, 77);
        button_10.setBackground(color_clear1);
        button_10.addActionListener(this);//it implements keyword to the class definition
        p_4.add(button_10);

        //Setting font to JButton
        Font font_10 = new Font("Arial", Font.BOLD, 15);
        button_10.setFont(font_10);
        p_4.add(button_10);


        //Button --> Change for Academic Course
        button_11 = new JButton("Change for Academic Course");
        button_11.setBounds(30, 390, 327, 30);

        //Setting Color to JButton
        Color color_change2 = new Color(255, 230, 204);
        button_11.setBackground(color_change2);
        button_11.addActionListener(this);//it implements keyword to the class definition
        p_4.add(button_11);

        //Setting font to JButton
        Font font_11 = new Font("Arial", Font.BOLD, 15);
        button_11.setFont(font_11);
        p_4.add(button_11);


        f_2.setVisible(true);//setting visible to frame
        f_2.setResizable(false);//setting frame resizable to false

    }

    public static void main(String[] args)
    {
        sf.createGUI();//to display main form
    }

    //Implementing the actionPerformed method  
    public void actionPerformed(ActionEvent e)

    {
        if(e.getSource() == button_5)
        {
            secondframe(); 
            f_1.dispose();
        }

        else if(e.getSource() == button_11)
        {
            f_2.dispose();
            createGUI();
        }

        //for add course for academic course
        if(e.getSource() == button_1)
        {
            //inside try block
            try{ 
                add_CourseID = field_CourseID.getText();

                add_CourseName = field_CourseName.getText();

                add_Duration = field_Duration.getText();
                
                int a_duration = Integer.parseInt(add_Duration);

                add_Level = field_Level.getText();

                add_Credit = field_Credit.getText();

                add_Assessment = field_Assessment.getText();
                int a_assessment = Integer.parseInt(add_Assessment);

                isDVno= false;
                for(Course var : alist){
                    if(var.getCourseid().equals(add_CourseID)){
                        isDVno = true;
                        break;
                    }
                }

                if(isDVno == false){
                    //Calling the constructor of Academic Course Class
                    object_academic = new AcademicCourse(add_CourseID, add_CourseName, a_duration,
                     add_Level, add_Credit, a_assessment);

                    //Adding the object to Array List
                    alist.add(object_academic);

                    msg1 = new JOptionPane();
                    String final_msg1 = "The Academic Course with \n" + "\n Course ID: " + add_CourseID + "\n Course Name: "
                        + add_CourseName + "\n Duration: " +  a_duration +  "\n Level: " + add_Level + "\n Credit: " 
                        + add_Credit + "\n Number of Assessment: " + a_assessment + "\n is sucessfully added";
                    msg1.showMessageDialog(f_1 , final_msg1);
                    //boolean box=true;
                }
                else{
                    for(Course ac:alist){
                        if(ac instanceof AcademicCourse){
                            if(ac.getCourseid().equals(add_CourseID)){
                                JOptionPane.showMessageDialog(f_1,"Dublicate value is added");
                            }
                            else{
                                hello = false;
                            }
                        }
                    }

                    if(hello = false){
                        object_academic = new AcademicCourse(add_CourseID, add_CourseName,
                            a_duration, add_Level, add_Credit, a_assessment);
                        alist.add(object_academic);
                        hello = true;
                    }
                }
                //closing of try block
            }

            catch(NumberFormatException nexpection_one)
            {
                try
                {
                    if(add_CourseID.equals("") && add_CourseName.equals("") &&
                    add_Duration.equals("") && add_Level.equals("") && add_Credit.equals("")
                    && add_Assessment.equals(""))
                    {
                        JOptionPane.showMessageDialog(f_1,"The text fields are Empty! Please fill the fields","Fill up",
                            JOptionPane.WARNING_MESSAGE);
                    }
                }
                catch(NullPointerException nexception_two)
                {
                    JOptionPane.showMessageDialog(f_1,"The text fields are Empty! Please fill the fields","Fill up",
                        JOptionPane.WARNING_MESSAGE);  
                }
            }
        }

        //Registration of Academic Course
        else if(e.getSource() == button_2){
            register_CourseID = field_CourseID.getText();
            //System.out.println(register_CourseID);

            register_Courseleader= field_Courseleader.getText();
            //System.out.println(register_Courseleader);

            register_LecturerName = field_LecturerName.getText();
            //System.out.println(register_LecturerName);

            //For Starting Date
            String year_1 = (js1.getSelectedItem()).toString();
            String month_1 = (js2.getSelectedItem()).toString();
            String day_1 = (js3.getSelectedItem()).toString();

            register_StartingDate = year_1 + month_1 + day_1;
            //System.out.println(register_StartingDate);

            //For Completion Date
            String year_2 = (js4.getSelectedItem()).toString();
            String month_2 = (js5.getSelectedItem()).toString();
            String day_2 = (js6.getSelectedItem()).toString();

            register_CompletionDate = year_2 + month_2 + day_2;
            //System.out.println(register_CompletionDate);

            if(alist.isEmpty()){
                JOptionPane.showMessageDialog(f_1,"Course has not been added");
            }
            else
            {
                //Comparison of CourseID
                boolean Courseidfound = false;
                for(Course var2 : alist){
                    if(var2.getCourseid().equals(register_CourseID)){

                        if(var2 instanceof AcademicCourse){
                            AC = (AcademicCourse)var2;
                            //System.out.println("Inside of instance of");
                            //If the academic course is already registered
                            if(AC.getisRegistered() == true){
                                JOptionPane.showMessageDialog(f_1,"Sorry,the course is already registered.");
                                break;
                            }
                            else if(AC.getisRegistered() == false){
                                AC.setregister(register_Courseleader, register_LecturerName, register_StartingDate, register_CompletionDate);
                                JOptionPane.showMessageDialog(f_1,"The Course is registered successfully.");
                                break;
                            }
                        }
                    }
                }
            }    
        }

        //Clear button of Academic Course
        if (e.getSource()==button_4){
            field_CourseID.setText("");
            field_CourseName.setText("");
            field_Duration.setText("");
            field_Level.setText("");
            field_Credit.setText("");
            field_Assessment.setText("");

            field_Courseleader.setText("");
            field_LecturerName.setText("");
            js1.setSelectedIndex(0);
            js2.setSelectedIndex(0);
            js3.setSelectedIndex(0);
            js4.setSelectedIndex(0);
            js5.setSelectedIndex(0);
            js6.setSelectedIndex(0);

        }

        //Display button of Academic Course
        else if(e.getSource() == button_3){
            if(alist.isEmpty()){
                JOptionPane.showMessageDialog(f_1,"Sorry Nothing To Display");
            }
            else{
                for(Course AC : alist){
                    if(AC instanceof AcademicCourse){
                        object_academic = (AcademicCourse) AC;
                        object_academic.display();
                    }
                }
            }
        }

        // Add course for Non-Academic Course    
        if(e.getSource() == button_6)
        {
            //inside try block
            try{
                add_CourseID1 = field_CourseID1.getText();

                add_CourseName1 = field_CourseName1.getText();

                add_Duration1 = field_Duration1.getText();
                //System.out.println(field_Duration1.getText());
                int a_duration1 = Integer.parseInt(add_Duration1);

                add_Prerequisite = field_Prerequisite.getText();

                isDVno1= false;
                for(Course var : alist){
                    if(var.getCourseid().equals(add_CourseID1)){
                        isDVno1 = true;
                        break;
                    }
                }

                if(isDVno1 == false){    

                    //Calling the constructor of Academic Course Class
                    object_nonacademic = new NonAcademicCourse(add_CourseID1,add_CourseName1,
                    a_duration1, add_Prerequisite);

                    //Adding the object to Array List
                    alist.add(object_nonacademic);

                    msg2 = new JOptionPane();
                    String final_msg2 = "The Non-Academic Course with \n" + "\n Course ID: " + add_CourseID1 + "\n Course Name: "
                    + add_CourseName1 + "\n Duration: " +  a_duration1 +  "\n Prerequisite: " + add_Prerequisite + "\n is sucessfully added";
                    msg2.showMessageDialog(f_2 , final_msg2);
                }
                else{
                    for(Course nac : alist){
                        if(nac instanceof NonAcademicCourse){
                            if(nac.getCourseid().equals(add_CourseID1)){
                                JOptionPane.showMessageDialog(f_2,"Dublicate value is added");
                            }
                            else{
                                helloo = false;
                            }
                        }
                    }

                    if(helloo = false){
                        object_nonacademic = new NonAcademicCourse(add_CourseID1, add_CourseName1,
                            a_duration1, add_Prerequisite);
                        alist.add(object_nonacademic);
                        helloo = true;
                    }
                }
                //closing of try block
            }

            catch(NumberFormatException nexpection_one)
            {
                try
                {
                    if(add_CourseID1.equals("") && add_CourseName1.equals("") &&
                    add_Duration1.equals("") && add_Prerequisite.equals(""))
                    {
                        JOptionPane.showMessageDialog(f_2,"The text fields are Empty! Please fill the fields","Fill up",
                        JOptionPane.WARNING_MESSAGE);
                    }
                }
                catch(NullPointerException nexception_two)
                {
                    JOptionPane.showMessageDialog(f_2,"The text fields are Empty! Please fill the fields","Fill up",
                    JOptionPane.WARNING_MESSAGE);  
                }
            }
        }
    
        //Registration of Non-Academic Course
        else if(e.getSource() == button_8){
            register_CourseID1 = field_CourseID1.getText();

            register_Courseleader1 = field_Courseleader1.getText();
            //System.out.println(register_Courseleader1);

            register_InstructorName = field_InstructorName.getText();
            //System.out.println(register_InstructorName);

            //For Starting Date
            String year_3 = (js7.getSelectedItem()).toString();
            String month_3 = (js8.getSelectedItem()).toString();
            String day_3 = (js9.getSelectedItem()).toString();

            register_StartingDate1 = year_3 + month_3 + day_3;
            //System.out.println(register_StartingDate1);

            //For Completion Date
            String year_4 = (js10.getSelectedItem()).toString();
            String month_4 = (js11.getSelectedItem()).toString();
            String day_4 = (js12.getSelectedItem()).toString();

            register_CompletionDate1 = year_4 + month_4 + day_4;
            //System.out.println(register_CompletionDate1);

            //For Exam Date
            String year_5 = (js13.getSelectedItem()).toString();
            String month_5 = (js14.getSelectedItem()).toString();
            String day_5 = (js15.getSelectedItem()).toString();

            register_ExamDate1 = year_5 + month_5 + day_5;
            //System.out.println(register_ExamDate1);
      
            if(alist.isEmpty()){
                JOptionPane.showMessageDialog(f_2,"Course has not been added");
            }
            else
            {
                //Comparison of CourseID
                boolean courseidfound = false;
                for(Course var2 : alist){
                    if(var2.getCourseid().equals(register_CourseID1)){

                        if(var2 instanceof NonAcademicCourse){
                            NAC = (NonAcademicCourse)var2;
                            //System.out.println("Inside of instance of");
                            //If the non-academic course is already registered
                            if(NAC.getisRegistered() == true){
                                //System.out.println("Inside of instance of");
                                JOptionPane.showMessageDialog(f_2,"Sorry,the course is already registered.");
                                break;
                            }
                            else if(NAC.getisRegistered() == false){
                                NAC.setregister(register_Courseleader1, register_InstructorName, register_StartingDate1, register_CompletionDate1,
                                    register_ExamDate1);
                                JOptionPane.showMessageDialog(f_2,"The Course is registered successfully.");
                                break;
                            }
                        }
                    }
                }
            } 
        }

        //Clear button of Non-Academic course
        if (e.getSource() == button_10){
            field_CourseID1.setText("");
            field_CourseName1.setText("");
            field_Duration1.setText("");
            field_Prerequisite.setText("");

            field_Courseleader1.setText("");
            field_InstructorName.setText("");
            js7.setSelectedIndex(0);
            js8.setSelectedIndex(0);
            js9.setSelectedIndex(0);
            js10.setSelectedIndex(0);
            js11.setSelectedIndex(0);
            js12.setSelectedIndex(0);

        }
        //Display button of Non-Academic Course
        else if(e.getSource() == button_9){
            if(alist.isEmpty()){
                JOptionPane.showMessageDialog(f_2,"Sorry Nothing To Display");
            }
            else{
                for(Course NAC : alist){
                    if(NAC instanceof NonAcademicCourse){
                        object_nonacademic = (NonAcademicCourse) NAC;
                        object_nonacademic.display();
                    }
                }
            }
        }

        //Remove button of Non-Academic Course
        if(e.getSource() == button_7){    
            for(Course var4 : alist){ 
                if(var4 instanceof NonAcademicCourse){                       
                    if(var4.getCourseid().equals(add_CourseID1)){                      
                        //NonAcademicCourse 
                        NAC = (NonAcademicCourse)var4; //downcasting to call remove method
                        if(NAC.getisRemoved() == true)
                        {
                            JOptionPane.showMessageDialog(f_2,"The Course is already Removed");
                            break;
                        }
                        else if(NAC.getisRemoved() == false){
                            NAC.remove();
                            JOptionPane.showMessageDialog(f_2,"Sucessfully Removed.");
                            break;
                        }                               
                    }                              
                }
            }
        }    
    }
}