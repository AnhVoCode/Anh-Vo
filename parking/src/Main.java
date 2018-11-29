import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num;
        int occupied = 0;
        String yeser;
        String today;
        num = in.nextLine();
        yeser = in.nextLine();
        today = in.nextLine();
        String[] t = new String[today.length()];
        String[] y = new String[today.length()];

        for(int i = 0;i<today.length();i++){
            t[i] = today.substring(i,i+1);
        }
        for(int i = 0; i <yeser.length();i++){
            y[i] = yeser.substring(i,i+1);
        }
        for (int i = 0; i <= t.length-1;++i){
            if (t[i].equals("C") && t[i].equals(y[i])){
                occupied++;
            }
        }
        System.out.println(occupied);



    }
}
