

public class Main {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        //print out the array
        for(int i=0;i<nums[0].length;i++){
            for(int k=0;k<nums.length;k++){
                System.out.print(nums[i][k]+"\t");
            }
            System.out.println();
        }
       /* //Copy to a temporary array
        int[][] temp = new int[4][4];
        for(int i=0;i<4;i++){
            for(int k=0;k<4;k++){
                temp[k][i] = nums[k][i];
            }
        }


        for(int i=0;i<temp[0].length;i++){
            for(int k =0;k<temp.length;k++){
                if(k==temp.length-1){
                    temp[k][i]=nums[0][i];
                }
                else {
                    temp[k][i]= temp[k+1][i];
                }
            }
        }
        nums = temp;
        System.out.println("-----new--------");
        for(int i=0;i<nums[0].length;i++){
            for(int k=0;k<nums.length;k++){
                System.out.print(nums[k][i]+"\t");
            }
            System.out.println();
        }*/

        //rotate
        int length = nums.length-1;
        System.out.println("-------Rotate------------");
        for(int i=0;i<nums.length/2;i++){
            for(int j=i;j<length-i;j++){
                int temp = nums[i][j];
                nums[i][j]=nums[length-j][i];
                nums[length-j][i]=nums[length-i][length-j];
                nums[length-i][length-j]=nums[j][length-i];
                nums[j][length-i]=temp;
            }
        }

        for(int i=0;i<nums[0].length;i++){
            for(int k=0;k<nums.length;k++){
                System.out.print(nums[i][k]+"\t");
            }
            System.out.println();
        }


    }
}
