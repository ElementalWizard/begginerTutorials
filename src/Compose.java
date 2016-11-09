/**
 * Created by Elemental on 11/5/2016.
 */
public class Compose {
    private String name;
    private ToString birthday;


    public Compose(String n, ToString d){
        name=n;
        birthday = d;
    }

    public String toString(){
        //sets the string that will be given when
        // the program wants a string from the calling
        // of this object as a string this object
        return String.format("My name is %s, and my birthday is %s",name,birthday);
    }



}
