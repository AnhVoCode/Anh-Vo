public class Student {
    //Fields
    private String firstName;
    private static int studentId=1;
    private String[] courses;

    //Constructor
    Student(String firstName){
        this.firstName=firstName;
    }

    //Methods
    public String getFirstName(){
        return firstName;
    }
    public int getStudentId(){
        return studentId++;
    }
    public String[] getCourses() {
        return courses;
    }
    public String addCourse(Courses courses){
        
    }



}
