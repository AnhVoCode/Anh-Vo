public class Student {
    //Fields
    String firstName;
    String lastName;
    int grade;
    static int id=0;

    //Constructor
     //Default
    Student(){
        firstName = "Anh";
        lastName = "Vo";
        grade = 85;
        id++;
    }
    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        id++;
    }
    //Getters and Setters

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    //Methods
     //Print out the object with name and grade
    public String toString(){
        return "Name: "+ firstName + "" + lastName + "" + "Grade: "+grade;
    }
}
