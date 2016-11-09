package File;

import java.io.File;

/**
 * Created by Elemental on 11/8/2016.
 */
public class Open {

    public Open(){
        File x = new File("C:\\test\\greg.txt");
        if(x.exists()){
            System.out.println(x.getName()+" exists!");
        }else{
            System.out.println("it doesnt exist");
        }
    }

}
