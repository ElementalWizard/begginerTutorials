/**
 * Created by Elemental on 11/5/2016.
 */
public enum Enumeration {

    //sets 3 constants that are objects at the same time with parameters
    bucky("nice","22"),
    kelsey("cute","10"),
    julia("mist","12"),
    nichole("italian","13"),
    candy("diferent","14"),
    erin("iwish","16");

    //defines those parameters name
    private final String desc;
    private final String year;


    //makes a constructer to say how they will be used
    Enumeration(String description, String birthday){
        desc= description;
        year=birthday;
    }


    //gets the values in these parameters
    public String getDesc(){
        return desc;
    }
    public String getYear(){
        return year;
    }


}
