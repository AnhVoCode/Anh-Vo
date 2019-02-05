public class Main {
    public static void main(String[] args) {
        Time day1 = new Time();
        Time day2 = new Time(32,73,62);
        System.out.println(day2.toString());
        /*System.out.println(day1.toString());
        System.out.println(day2.getSecond());
        System.out.println(day2.nextSecond(day2));*/
        day2.setTime(0,0,0);
        System.out.println(day2);
        System.out.println(day2.previousSecond(day2));
    }
}
