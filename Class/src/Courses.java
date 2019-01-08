public class Courses {
    //fields
    private String subjectName;
    private int studentGrade;

    //constructor
    Courses(String subjectName, int studentGrade){
        this.subjectName=subjectName;
        this.studentGrade=studentGrade;
    }
    //methods
    public String getSubjectName(){
        return subjectName;
    }
    public int getStudentGrade() {
        return studentGrade;
    }


}
