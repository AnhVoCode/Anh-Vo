
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> scores = new ArrayList<>();
        String score;
        int count=0;
        for(int i=0;i<6;i++){
            score = in.nextLine();
            scores.add(score);
        }
        for(String s: scores){
            if(s.equals("W")){
                count+=1;
            }
        }
        if(count==5 || count==6){
            System.out.println("1");
        }
        else if(count==4 || count ==3){
            System.out.println("2");
        }
        else if(count==2|| count==1){
            System.out.println("3");
        }
        else {
            System.out.println("-1");
        }
    }
}
