/**
 * Created by Elemental on 11/5/2016.
 */
public class StaticVar {

    //private means it cant be changed or
    // acceced from outside
    private String first;
    private String last;

    //static means that this var is shared by all objects
    //that are created of this class
    private static int members = 0;

    public StaticVar(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("The number of members is %d this new one called %s %s\n", members,first,last);
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }


}
