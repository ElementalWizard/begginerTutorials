package SmallPolyProg;

/**
 * Created by Elemental on 11/7/2016.
 */
public class AnimalList {
    private Animal[] theList = new Animal[5];
    private int i = 0;

    public void add(Animal a){
        if(i<theList.length){
            theList[i]=a;
            System.out.printf("Animal %s added at index %d \n",a,i);
            i++;
        }

    }
}
