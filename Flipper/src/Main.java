import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String flip = in.nextLine();
        int[][] nums = {{1,3},{2,4}};
        for(int i=0;i<nums[0].length;i++){
            for(int j=0;j<nums.length/2;j++){
                for(int k=0;k<flip.length();k++){
                    if(flip.charAt(k)=='H'){
                       int temp = nums[j][i];
                       nums[j][i]=nums[j][nums.length-1-i];
                       nums[j][nums.length-1-i]=temp;
                    }
                    /*else if(flip.charAt(k)=='V') {
                        int temp = nums[j][i];
                        nums[j][i] = nums[j+1][i];
                        nums[j+1][i] = temp;
                    }*/
                }
            }
        }
        for(int i=0;i<2;i++){
            for(int k=0;k<2;k++){
                System.out.print(nums[k][i]+" ");
            }
            System.out.println();
        }

    }
}
