public class Courses {
    //fields
    private String subjectName;
    private int studentGrade;

    //constructor
     //Default
    Courses(){
        subjectName = "Maths";
    }
    Courses(String subjectName, int studentGrade){
        this.subjectName=subjectName;
        this.studentGrade=studentGrade;
    }
    //methods


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }
    public String toString(){
        return "Subject name: "+subjectName;
    }
}
