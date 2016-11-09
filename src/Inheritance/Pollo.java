package Inheritance;

/**
 * Created by Elemental on 11/7/2016.
 */
//extends means inheritance all from food is here too now
public class Pollo extends Food {

    //now that it extends you can override thosee method
    // by rewriting them and this will have more weight
    // than the original.its like a default.
    //they can even extend a class that extends a class
    // creating a chain having all from both unless its
    // private method like a variable


    //**now with the same inheritance program we can talk
    // about polymorphism**

    //since this extends an abstract class it needs to
    // implement/overide all the abstract methods within it
    public void eat(){
        System.out.println("This pollo is great");
    }
}
