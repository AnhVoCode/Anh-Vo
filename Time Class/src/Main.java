public class Main {
    public static void main(String[] args) {
        Time day1 = new Time();
        System.out.println(day1);

        Time day2 = new Time(32,73,62);
        System.out.println(day2.toString());

        day2.setTime(32,73,62);
        System.out.println(day2);

        day2.nextSecond();
        System.out.println(day2);

        day1.previousSecond();
        System.out.println(day1);

    }
}
