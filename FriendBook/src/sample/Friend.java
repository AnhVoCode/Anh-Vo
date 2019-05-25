package sample;

public class Friend {
    public String name;
    private int age;
    private String gender;

    //Constructor
    public Friend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //Getters
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    //Display name instead of location of the object
    public String toString(){
        return name;
    }

}
