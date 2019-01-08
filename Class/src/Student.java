public class Student {
    //Fields
    private String firstName;
    private int studentId;
    private String[] courses;

    //Constructor
    Student(String firstName, int studentId){
        this.firstName=firstName;
        this.studentId=studentId;
    }
    //Methods
    public String getFirstName(){
        return firstName;
    }
    public int getStudentId(){
        return studentId+1;
    }
    public String[] getCourses() {
        return courses;
    }
    

}
