import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A3 = Integer.parseInt(in.nextLine());
        int A2 = Integer.parseInt(in.nextLine());
        int A1 = Integer.parseInt(in.nextLine());
        int B3 = Integer.parseInt(in.nextLine());
        int B2 = Integer.parseInt(in.nextLine());
        int B1 = Integer.parseInt(in.nextLine());
        int sumA = A3*3+A2*2+A1;
        int sumB = B3*3+B2*2+B1;
        if (sumA>sumB){
            System.out.println("A");
        }
        else if(sumA<sumB){
            System.out.println("B");
        }
        else{
            System.out.println("T");
        }
    }
}
