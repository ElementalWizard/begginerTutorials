package File;

import java.io.*;
import java.util.*;

/**
 * Created by Elemental on 11/8/2016.
 */
public class Read {

    private Scanner z;

    public void openFile(){
        try{
            z= new Scanner(new File("potato.txt"));
        }catch(Exception e){
            System.out.println("Didnt find file");
        }
    }

    public void readFile(){
        while(z.hasNext()){
            String A = z.next();
            String B = z.next();
            String C = z.next();
            System.out.printf("%s %s %s\n",A,B,C);
        }
    }
    public void closeFile(){
        z.close();
    }

}
