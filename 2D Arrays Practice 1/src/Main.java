
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int col = Integer.parseInt(in.nextLine());
        int row = Integer.parseInt(in.nextLine());
        int[][] num = new int[col][row];
        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
                num[k][i]= (int) (Math.random()*90)+10;
            }
        }

        //Print array
        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
                System.out.print(num[k][i]+"\t");
            }
            System.out.println();
        }
        //find sum
        int sum =0;
        for(int i=0;i<num[0].length;i++){
            for(int k=0;k<num.length;k++){
                sum+=num[k][i];
            }
        }
        System.out.println(sum);

        //flip arrays
        System.out.println("----------------Flipped Array--------------");
        for(int i=0;i<num[0].length;i++){
            for(int k=0;k<num.length/2;k++){
                int temp = num[k][i];
                num[k][i] = num[num.length-1-k][i];
                num[num.length-1-k][i] = temp;
            }
        }
        for(int i=0;i<num[0].length;i++){
            for(int k=0;k<num.length;k++){
                System.out.print(num[k][i]+"\t");
            }
            System.out.println();
        }
    }
}
