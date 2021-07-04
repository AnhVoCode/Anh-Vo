
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int numOfLines = in.nextInt();
        for(int i=0;i<numOfLines;i++){
            String input = in.next();
            lines.add(input);
        }
        char test;
        char letter;
        int count =0;
        for(int i=0;i<lines.size();i++){
            test =lines.get(i).charAt(0);
            for(int k=0;k<lines.get(i).length();k++){
                letter = lines.get(i).charAt(k);
                if(letter==test){
                    count++;
                }else{
                    if(letter!=test){
                        System.out.print(count+" "+test+" ");
                        test = letter;
                        count=1;
                    }
                }
            }
            System.out.println(count+" "+test+" ");
            count=0;

        }


    }
}
