package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;
/**
 * Created by Elemental on 11/8/2016.
 */
//dropdown list
public class JComboboxs extends JFrame{

    private JComboBox box;
    private JLabel picture;

    private static String[] filename ={"x.png","y.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};

    public JComboboxs(){
        super("title");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

        box.addItemListener(
                new ItemListener() {

                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange()==ItemEvent.SELECTED){
                            picture.setIcon(pics[box.getSelectedIndex()]);
                        }
                    }
                }
                );
        add(box);
        picture = new JLabel((pics[0]));
        add(picture);





    }


}
