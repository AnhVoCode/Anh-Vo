public class Main {
    public static void main(String[] args) {
        //Add 10 students to student list
        Student a = new Student("1",null,0);
        Student b = new Student("2",null,0);
        Student c = new Student("3",null,0);
        Student d = new Student("4",null,0);
        Student e = new Student("5",null,0);
        Student f = new Student("6",null,0);
        Student g = new Student("7",null,0);
        Student h = new Student("8",null,0);
        Student i = new Student("9",null,0);
        Student j = new Student("10",null,0);
        Student[] x = {a,b,c,d,e,f,g,h,i,j};
        School s  = new School();
        for (Student y:x){
            s.addStudent(y);
        }
        //Show student list
        s.showStudent();
        //remove 2 students
        s.deleteStudent(a);
        s.deleteStudent(b);
        //show the list again
        System.out.println("show the list again");
        s.showStudent();

        //Add 3 teachers to the ArrayList
        Teacher A = new Teacher("A","Vo","Math");
        Teacher B = new Teacher("B","Lee","Physics");
        Teacher C = new Teacher("C","Dean","English");
        School t = new School();
        t.addTeacher(A);
        t.addTeacher(B);
        t.addTeacher(C);
        //Show teacher lists
        t.showTeacher();
        //Remove a teacher
        t.deleteTeacher(A);
        //Reshow the teacher list
        System.out.println("After remove 1 teacher:");
        t.showTeacher();


    }

}
