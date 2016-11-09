package File;

import java.io.*;
import java.util.*;
import java.lang.*;
/**
 * Created by Elemental on 11/8/2016.
 */
public class Edit_Adds {

    private Formatter y;

    public void openFile() {
        try {
            y = new Formatter("potato.txt");
        } catch (Exception e) {
            System.out.println("You have an error");
        }
    }

    public void addRecords(){
        y.format("%s%s%s","20 ","bucky ","roberts");
    }

    public void closeFile(){
        y.close();
    }
}
