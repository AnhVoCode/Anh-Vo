import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*//Input
        Scanner in = new Scanner(System.in);
        int[] distance = new int[4];
        for (int i:distance){
            distance[i]= in.nextInt();
        }

        //Output*/
        int[] distance={3,10,12,5};
        for (int row =0; row<5;row++ ){
            for (int column = 0; column<5;column++){
                int begin = Math.min(row,column);
                int last = Math.max(row,column);
                int d=0;
                for (int i = begin; i<last;i++){
                    d+=distance[i];
                }
                System.out.print(d);
            }
            System.out.println("");


        }

    }


}
