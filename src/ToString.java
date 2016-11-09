/**
 * Created by Elemental on 11/5/2016.
 */
public class ToString {

    private int month;
    private int day;
    private int year;

    public ToString(int m, int d, int y){
        month = m;
        day = d;
        year = y;
        //prints this when object is created  with the string referenced in the toString built in method
        System.out.printf("The constructer for this is %s\n",this);
    }

    public String toString(){
        //sets the string that will be given when the program wants a string from the calling of this object as a string this object
        return String.format("%d/%d/%d", month,day, year);
    }

}
