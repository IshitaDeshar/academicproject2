//creating Non Academic Course class
public class NonAcademicCourse extends Course
{
    
    //attributes of AcademicCourse class
    
    private String Instructor_name;
    private String Start_date;
    private String Completion_date;
    private String Exam_date;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    //Constructor with a parameter
    
public NonAcademicCourse (String Courseid, String Course_name, int duration, String prerequisite)
    {
     super(Courseid, Course_name, duration);
     this.Start_date = " ";
     this.Completion_date = " ";
     this.Exam_date = " ";
     this.prerequisite = prerequisite;
     this.Instructor_name = Instructor_name;
     this.isRegistered = false;
     this.isRemoved = true;
    }
    
    //Creating public get() methods of all the attributes
    
public String getInstructor_name()
{
    return Instructor_name;
}

    //Creating public get() methods of Start_date.

public String getStart_date()
{
    return Start_date;
}

    //Creating public get() methods of Completion_date.

public String getCompletion_date()
{
    return Completion_date;
}

    //Creating public get() methods of Exam_date.

public String getExam_date()
{
    return Exam_date;
}

    //Creating public get() methods of prerequisite.

public String getprerequisite()
{
    return prerequisite;
}

    //Creating public get() methods of isRegistered.

public boolean getisRegistered()
{
    return isRegistered;
}

    //Creating public get() methods of isRemoved.

public boolean getisRemoved()
{
    return isRemoved;
}

    //Creating non-return set() methods of Instructor_name.
    //passing newInstructor_name variable as parameter in setInstructor_name()method

public void setInstructor_name(String newInstructor_name)
{
    this.Instructor_name = newInstructor_name;
}  

public void setregister (String Course_leader, String Instructor_name, String Start_date, String Completion_date, String Exam_date)
{
    
    //code if condition is true
    
    if (isRegistered == false)
    {
        setInstructor_name(Instructor_name);
        setCourse_leader(Course_leader);
        this.Start_date = Start_date;
        this.Completion_date = Completion_date;
        this.Exam_date = Exam_date;
        isRegistered = true;
    }
    
    //code if condition is false
    
    else
    {
        System.out.println("The course is registered"+isRegistered);
    }
}

public void remove()
{
        super.setCourse_leader(" ");
        this.Instructor_name = " ";
        this.Start_date = " ";
        this.Completion_date = " ";
        this.Exam_date = " ";
        this.isRemoved = true;
        this.isRegistered = false;
}

public void display()
{
    if (this.isRegistered)
    {
        System.out.println("The Instructor_name is "+Instructor_name);
        System.out.println("The Start_date is "+Start_date);
        System.out.println("The Completion_date is "+Completion_date);
        System.out.println("The Exam_date is "+Exam_date);
    }
}

}