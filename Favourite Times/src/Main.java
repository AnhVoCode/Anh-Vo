import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int duration = in.nextInt();
        int hour = 12;
        int minute = 0;
        String min;
        String hr;
        String time="";
        int count = 0;
        for(int i=0;i<duration;i++) {
            minute += 1;
            if (minute >= 60) {
                minute -= 60;
                if (hour + 1 < 13) {
                    hour += 1;
                } else {
                    hour = (hour + 1) % 12;
                }
            }
            if (minute < 10) {
                min = "0" + Integer.toString(minute);
            } else {
                min = Integer.toString(minute);
            }
        }
        min = Integer.toString(minute);
        hr = Integer.toString(hour);
        time = min + hr;
        if(time.length()==3){
            if(((int)time.charAt(2)-(int)time.charAt(1))==((int)time.charAt(1)-(int)time.charAt(0))){
                count+=1;
            }
        }
        else {
            if((int)time.charAt(3)-(int)time.charAt(2) ==((int)time.charAt(2)-(int)time.charAt(1))&&
                    ((int)time.charAt(2)-(int)time.charAt(1))==(int)time.charAt(1)-(int)time.charAt(0)){
                count+=1;
            }
        }
        System.out.println(count);
    }
}