public class Main {
    public static void main(String[] args) {
        Student a = new Student();
        /*System.out.println(a);
        Student b = new Student("Mary");
        System.out.println(b);
        Courses c = new Courses();
        System.out.println(c);*/
        Courses English = new Courses("English", 80);
        Courses Math = new Courses("Math",92);
        a.addCourse(English);
        a.addCourse(Math);
        System.out.println(a.avgGrade());
        a.printCourse();

        }
}
