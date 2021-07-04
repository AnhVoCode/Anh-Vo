import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] table = new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                table[i][j]=in.nextInt();
            }
        }
       //find the smallest measure
        int i,j;
        if(table[0][0]<table[0][num-1]) j=0;
        else                            j=num-1;

        if(table[0][j]<table[num-1][j]) i=0;
        else                            i=num-1;

        //Find the original input
        //Top left
        if(i==0 && j==0){
            for(int x=0;x<num;x++){
                for(int y=0;y<num;y++){
                    System.out.print(table[x][y]+" ");
                }
                System.out.println();
            }
        }

        //Top Right
        else if(i==0 && j>0){
            for(int y= num-1;y>=0;y--){
                for(int x=0;x<num;x++){
                    System.out.print(table[x][y]+" ");
                }
                System.out.println();
            }
        }

        //Bottom Right
        else if(i>num && j>num){
            for(int x= num-1;x>=0;x--){
                for(int y=num-1;y>=0;y--) {
                    System.out.print(table[x][y]+" ");
                }
                System.out.println();
            }

        }

        //Bottom Left
        else {
            for(int y=0;y<num;y++){
                for(int x=num-1;x>=0;x--){
                    System.out.print(table[x][y]+" ");
                }
                System.out.println();
            }
        }
    }
}
