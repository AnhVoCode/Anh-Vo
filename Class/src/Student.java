public class Student {
    //Fields
    private String firstName;
    private static int num=1;
    private int studentId;
    private Courses[]courses= new Courses[8];

    //Constructor
     //Default
    Student(){
        firstName = "Anh";
        studentId=num;
        num++;
    }
     //Take in a name, increase id by 1
    Student(String firstName){
        this.firstName=firstName;
        studentId=num;
        num++;
    }

    //Methods
     //Getter & Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Courses[] getCourses() {
        return courses;
    }

    public void setCourses(Courses[] courses) {
        this.courses = courses;
    }

    //Print out the object
    public String toString(){
        return "First name:"+firstName+", Student ID:"+studentId;
    }
    //Add a course to the array
    public Courses[] addCourse(Courses courses){
        int pos=0;
        this.courses[pos]=courses;
        pos++;
       return this.courses;
    }
    
}
