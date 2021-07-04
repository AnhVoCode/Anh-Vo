import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int num = Integer.parseInt(in.nextLine());
        nums.add(num);
        int numOfShift = Integer.parseInt(in.nextLine());
        int sum = 0;
        for(int i=0;i<numOfShift;i++){
            num*=10;
            nums.add(num);
        }
        for(Integer n:nums){
            sum+=n;
        }
        System.out.println(sum);
    }
}
