import java.util.ArrayList;

public class School {
    //fields
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    String teacherName;
    String studentName;
    int numOfClass;

    //constructor


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

    //methods
    public void addTeacher(Teacher teacher){
        for (int i=0;i<teachers.size();i++){
            teachers.add(i,teacher);
        }
    }
    public void addStudent(Student student){
        for (int i=0; i<students.size();i++){
            students.add(i,student);
        }
    }
    public void deleteTeacher(Teacher teacher){
        for (int i=0;i<teachers.size();i++){
            teachers.remove(i);
        }
    }


}
