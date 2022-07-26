//Creating Academic Course class
public class AcademicCourse extends Course
{   
    
    //attributes of AcademicCourse class
    
    private String Lecturer_name;
    private String Level;
    private String Credit;
    private String Starting_Date;
    private String Completion_Date;
    private int Number_of_Assessments;
    private boolean isRegistered;
    
    //Constructor with a parameter
    
public AcademicCourse (String Courseid, String Course_name, int duration, String Level, String Credit, int Number_of_Assessments)
    {
    super(Courseid, Course_name, duration);
    this.Level = Level;
    this.Credit = Credit;
    this.Number_of_Assessments = Number_of_Assessments;
    this.Lecturer_name = " ";
    this.Starting_Date = " ";
    this.Completion_Date = " ";
    this.isRegistered = false;
    }
    
    //Creating public get() methods of all the attributes.
    
public String getLecturer_name()
{
    return Lecturer_name;
}

    //Creating public get() methods of Level.

public String getLevel()
{
    return Level;
}

    //Creating public get() methods of Credit.

public String getCredit()
{
    return Credit;
}

    //Creating public get() methods of Starting_Date.

public String getStarting_Date()
{
    return Starting_Date;
}

    //Creating public get() methods of Completion_Date.

public String getCompletion_Date()
{
    return Completion_Date;
}

    //Creating public get() methods of Number_of_Assessments.

public int getNumber_of_Assessments()
{
    return Number_of_Assessments;
}

    //Creating public get() methods of isRegistered.

public boolean getisRegistered()
{
    return isRegistered;
}

    //Creating non-return set() methods of Lecturer_name.
    //passing newLecturer_name variable as parameter in setLecturer_name()method

public void setLecturer_name(String newLecturer_name)
{
    this.Lecturer_name = newLecturer_name;
}

    //Creating public get() methods of Number_of_Assessments.
    //passing newNumber_of_Assessments variable as parameter in setNumber_of_Assessments()method

public void setNumber_of_Assessments(int newNumber_of_Assessments)
{
    this.Number_of_Assessments = newNumber_of_Assessments;
}

public void setregister (String Course_leader, String Lecturer_name, String Starting_Date,String Completion_Date)
{
    
    //code if condition is true
    
    if (isRegistered == true)
    {
        System.out.println("The Course is already registered"+"The name of the lecturer is"+Lecturer_name + "The Starting date is"+Starting_Date 
        + "and the completion date is"+Completion_Date);
    }
    
    //code if condition is false
    
    else
    {
        super.setCourse_leader(Course_leader);
        this.Lecturer_name = Lecturer_name;
        this.Starting_Date = Starting_Date;
        this.Completion_Date = Completion_Date;
        isRegistered = true;
    }
}

public void display()
{
    super.display();
    if (isRegistered == true)
    {
        System.out.println("The Lecturer_name is "+Lecturer_name);
        System.out.println("The Level is "+Level);
        System.out.println("The Credit is "+Credit);
        System.out.println("The Starting_Date is "+Starting_Date);
        System.out.println("The Completion_Date is "+Completion_Date);
        System.out.println("The Number_of_Assessments is "+Number_of_Assessments);
        System.out.println("The isRegistered is "+isRegistered);
    }
}

}