//Creating Course class
public class Course
{

    //attributes of Course class

    private String Courseid;
    private String Course_name;
    private String Course_leader;
    private int duration;

    //Constructor with a parameter

    public Course (String Courseid, String Course_name, int duration)
    {

        this.Courseid = Courseid;
        this.Course_name = Course_name;
        this.duration = duration;
        this.Course_leader = "";

    }

    //Creating public get() methods of Course_id

    public String getCourseid()
    {
        return Courseid;
    }

    //Creating public get() methods of Course_name.

    public String getCourse_name()
    {
        return Course_name;
    }

    //Creating public get() methods of Course_leader.

    public String getCourse_leader()
    {
        return Course_leader;
    }

    //Creating public get() methods of duration.

    public int getduration()
    {
        return duration;
    }

    //Creating non-return set() methods of Course_leader.

    public void setCourse_leader(String newCourse_leader)//passing newCourse_leader variable as parameter in setCourse_leader()method
    {
        this.Course_leader = newCourse_leader;
    }

    //displays the Courseid, Course_name, duration.

    public void display ()
    { 
        System.out.println("The courseid id "+Courseid);
        System.out.println("The course_name is "+Course_name);
        System.out.println("The duration is "+duration);

        //check for condition

        if (Course_leader != "")
        {
            System.out.println("The course_leader is "+Course_leader);//displays the Course_leader
        }
    }

}
