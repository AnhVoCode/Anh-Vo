
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String start = in.nextLine();
        String end = in.nextLine();
        int charge = Integer.parseInt(in.nextLine());
        String[] startCoordinate = start.split(" ");
        String[] endCoordinate = end.split(" ");
        int startX = Integer.parseInt(startCoordinate[0]);
        int startY = Integer.parseInt(startCoordinate[1]);
        int endX = Integer.parseInt(endCoordinate[0]);
        int endY = Integer.parseInt(endCoordinate[1]);
        int distance = Math.abs(endX-startX)+Math.abs(endY-startY);
        if(charge==distance){
            System.out.println("Y");
        }
        else if(charge>distance){
            if((charge-distance)%2==0){
                System.out.println("Y");
            }
            else {
                System.out.println("N");
            }
        }
        else {
            System.out.println("N");
        }

    }
}
