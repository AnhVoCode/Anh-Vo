
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        int numOfChar;
        char letter;
        String input = "";
        int numOfLines = Integer.parseInt(in.nextLine());
        for (int i = 0; i < numOfLines; i++) {
            numOfChar = in.nextInt();
            letter = in.next().charAt(0);
            nums.add(numOfChar);
            chars.add(letter);
        }
        for(int i=0;i<chars.size();i++){
            for(int k=0;k<nums.get(i);k++){
                System.out.print(chars.get(i));
            }
            System.out.println();
        }

    }
}


