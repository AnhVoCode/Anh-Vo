public class Time {
    //Fields
    private int hour;
    private int minute;
    private int second;

    //Constructors
     //Default
    Time(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    //Input
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        }
     //Getters and Setters

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    //Handle invalid inputs
    public void setTime(int hour, int minute, int second){
        if (second>=0&&second<60){
            this.second = second;
        }
        else {
            this.second= second-60;
        }
        if (minute>=0&&minute<60){
            this.minute=minute;
        }
        else{
            this.minute = minute - 60;
        }
        if (hour>=0&&hour<24){
            this.hour=hour;
        }
        else {
            this.hour = hour -24;
        }
        }
    //Methods
     //printout the time
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
     //next second
    public void nextSecond(){
        second++;
        if (second>59){
            minute++;
            second=0;
            if (minute>59){
                hour++;
                minute=0;
            }
            if (hour>23){
                hour = 0;
                minute=0;
                second=0;
            }
        }
    }
     //previous second
    public void previousSecond(){
       second--;
        if (second<0){
            minute--;
            second=59;
            if (minute<0){
                hour--;
                minute=59;
                if (hour<0){
                    hour=0;
                    minute=59;
                    second=59;
                }
            }
        }
    }
}
