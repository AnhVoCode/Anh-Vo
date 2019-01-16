import java.util.ArrayList;
public class Student {
    //Fields
    private String firstName;
    private static int studentId=0;
    private ArrayList<Courses> courses = new ArrayList<Courses>();

    //Constructor
     //Default
    Student(){
        firstName = "Anh";
        studentId++;
    }
     //Take in a name, increase id by 1
    Student(String firstName){
        this.firstName=firstName;
        studentId++;
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

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Courses> courses) {
        this.courses = courses;
    }

    //Print out the object
    public String toString(){
        return "First name:"+firstName+", Student ID:"+studentId;
    }

    //Add a course to the array
    public void addCourse(Courses c){
        this.courses.add(c);
    }

    //Calculate average grade
    public int avgGrade(){
        int sum=0;
        for (Courses c:courses){
            sum+=c.getStudentGrade();

        }
        return sum/courses.size();
    }

    //print out all courses
    public void printCourse(){
        if (courses.size()==0){
            System.out.println("No course");
        }
        else {
            for (Courses c:courses){
                System.out.println(c.getSubjectName()+", ");
            }
        }
    }

}
