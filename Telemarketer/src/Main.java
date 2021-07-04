import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
       for(int i=0;i<4;i++){
           int num = in.nextInt();
           nums.add(num);
       }
       if(nums.get(0)==8||nums.get(0)==9 && nums.get(3)==8||nums.get(3)==9 && nums.get(1)==nums.get(2)){
           System.out.println("ignore");
       }
       else {
           System.out.println("answer");
       }


    }
}
