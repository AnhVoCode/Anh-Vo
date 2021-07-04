import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "ABCabc";
        char ch;
        int i=0;
        while(i<str.length()){
            ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                System.out.print(i+" ");
            }
            else{
                i++;
            }
        }
    }
}
