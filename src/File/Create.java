package File;

import java.io.*;
import java.util.*;
import java.lang.*;
/**
 * Created by Elemental on 11/8/2016.
 */
public class Create {

    private Formatter x;

    public Create(){
        try{
            //the constructor for this is wha file where
            //,if only name is given the path will be same
            // as class,if not found one will be created
            x = new Formatter("fred.txt");

            System.out.println("You created a file");
        }catch(Exception e){
            System.out.println("You got an error");
        }
    }

}
