import java.util.ArrayList;

public class School {
    //Fields
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    String teacherName;
    String studentName;
    int numOfClass;

    //constructor
      //Default
    School(){
        teacherName = "";
        studentName = "";
        numOfClass = 0;
    }
    School(String teacherName, String studentName){
        this.teacherName = teacherName;
        this. studentName = studentName;
    }

    //getters and setters
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getNumOfClass() {
        return numOfClass;
    }

    public void setNumOfClass(int numOfClass) {
        this.numOfClass = numOfClass;
    }

    //Methods
     //Add teacher to teacher array + add student to student array
    public void addTeacher(Teacher t){
        this.teachers.add(t);
        }
    public void addStudent(Student s){
        this.students.add(s);
    }

     //Delete teacher from the array + delete student from the array
    public void deleteTeacher(Teacher t){
        this.teachers.remove(t);
    }
    public void deleteStudent(Student s){
        this.students.remove(s);
    }

     //Show all teachers and students
    public void showTeacher (){
        if (teachers.size()==0){
            System.out.println("No teacher to print");
        }
        else {
            for (Teacher t:teachers){
                System.out.println(teacherName+", ");
            }
        }
    }
    public void showStudent(){
        if (students.size()==0){
            System.out.println("No student to print");
        }
        else {
            for (Student s: students){
                System.out.println(studentName+ ", ");
            }
        }
    }


}
