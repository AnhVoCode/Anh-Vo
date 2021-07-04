import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        int[] distance = {num1,num2,num3,num4};
        int d=0;
        for (int i=0; i<distance.length;i++){
            for (int j=0;j<distance.length;j++){
                if (j==i){
                    d=0;
                    System.out.print(d+" ");
                }
                if (j<i) {
                    for (int k = 0; k > -1; k--) {
                        d += distance[k];
                        System.out.print(d + " ");
                    }
                }
                else {
                    d+=distance[j];
                    System.out.print(d+" ");
                }
            }
            System.out.println();

        }

    }
}
