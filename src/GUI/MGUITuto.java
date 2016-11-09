package GUI;

//this is the class that helps our layout
import java.awt.FlowLayout;
//gives basic windows features,open close etc
import javax.swing.JFrame;
//lets you put text and images on screen
import javax.swing.JLabel;
/**
 * Created by Elemental on 11/7/2016.
 */

//moderate(second) gui tuto
// will have all the window features by extends
public class MGUITuto extends JFrame{
        //this will be an item where we will store said text
    private JLabel item1;

    public MGUITuto(){
        //this is how you add title
        super("The title bar");
        //sets default layout
        setLayout(new FlowLayout());
        //here you add what you want in this item:
        // in this case a sentence
        item1=new JLabel("this is a sentance");
        //lets add funcionality
        item1.setToolTipText("this is the hover text");
        //we also wanna add it to the window
        add(item1);


    }
}
