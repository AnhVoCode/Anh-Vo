import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word you like:");
        String x; //word input
        x = scan.next();
        scan.close();

        //Encryption: Take the last letter to the front, then adding "ay"
        String e; //encryption
        int i = x.length()-1;
        System.out.println(e = x.charAt(i)+x.substring(0,i)+"ay");

         //Decryption: Back to original
        System.out.println(e.substring(1,i+1)+ e.charAt(0));
    }
}
