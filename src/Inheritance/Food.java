package Inheritance;

/**
 * Created by Elemental on 11/7/2016.
 */
//abstract means this cant be initialized as an object
// becouse its to general like a template
abstract public class Food {
    //this will be the super class becouse it will
    // hold all that the classes underneeth (subclasses) it hold in
    // common;vars,methods etc


    //**now with the same inheritance program we can talk
    // about polymorphism**


    //since its an abstract body it doesnt need abody,
    // those who use it will give it one
    public abstract void eat();

    //they dont need to be abstract tho


}
