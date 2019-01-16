public class Teacher {
    //Fields
    String firstName;
    String lastName;
    String subjectName;

    //Constructors
    Teacher(){
        firstName = "Paul";
        lastName = "Zaremba";
        subjectName = "Programming 11";
    }
    Teacher(String firstName, String lastName, String subjectName){
        this.firstName= firstName;
        this.lastName = lastName;
        this.subjectName = subjectName;
    }

    //Getter and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    //Methods : print out the object with name and subject
    public String toString (){
        return "Name:" +firstName+""+lastName+""+"Subject:"+subjectName;
    }
}
