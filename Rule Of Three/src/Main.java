import java.util.Scanner;

public class Main {
    public static void rule1(String str){
        if(str.equals("AA")){
            str = "AB";
        }
    }
    public static void rule2(String str){
        if(str.equals("AB")){
            str = "BB";
        }
    }
    public static void rule3(String str){
        if(str.equals("B")){}
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String rule1 = in.nextLine();
        String rule2 = in.nextLine();
        String rule3 = in.nextLine();
        String input = in.nextLine();
    }
}
