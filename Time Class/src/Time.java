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
    //Handle invalid inputs
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
    public Time nextSecond(Time t){
        t.second++;
        if (t.second==60){
            t.minute++;
            t.second=0;
            if (t.minute==60){
                t.hour++;
                t.minute=0;
            }
            if (hour==24){
                t.hour = 0;
                t.minute=0;
                t.second=0;
            }
        }
        return t;
    }
     //previous second
    public Time previousSecond(Time t){
        t.second--;
        if (t.second==0){
            t.minute--;
            t.second=59;
            if (t.minute==0){
                t.hour--;
                t.minute=59;
                if (t.hour==0){
                    t.hour=0;
                    t.minute=0;
                    t.second=0;
                }
            }
        }
        return t;
    }
}
