/**
 * Created by Elemental on 11/4/2016.
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    //checks if the time is within the limits of a day
    public void setTime(int h, int m, int s){
        hour = ((h>=0 && h<24) ? h:0);
        minute = ((m>=0 && m<60) ? m:0);
        second = ((s>=0 && s<60) ? s:0);
    }

    //prints mill time
    public String mil(){
        //formats the string to pring the given value
        // with two decima points becouse time can have two values
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    //prints normal time
    public String Norm(){
        //formats the string to pring the given value
        // with two decima points becouse time can have two values
       return String.format("%d:%02d:%02d %s",(hour==0||hour==12)?12:hour%12,minute,second,(hour <12?"AM":"PM"));
    }

}
