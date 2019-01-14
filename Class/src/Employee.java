public class Employee {
    //fields
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    //method
    public int getId(){
        this.id = id;
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        double temp = salary;
        temp = temp +((1+percent)/100);
        salary = (int)temp;
        return salary;
    }
    public String toString(){
        return "Employee[id="+id+",name="+firstName+lastName+", salary="+salary+"]";
    }
}
