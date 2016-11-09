package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;
/**
 * Created by Elemental on 11/7/2016.
 */
public class JCheckbox extends JFrame {

    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public JCheckbox(){
        super("the title");
        setLayout(new FlowLayout());

        tf = new JTextField("This is a sentance",20);
        tf.setFont(new Font("Serif", Font.PLAIN,14));
        add(tf);

        boldbox = new JCheckBox("BOLD");
        italicbox = new JCheckBox("Italic");
        add(boldbox);
        add(italicbox);

        thirdHandler handler = new thirdHandler();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);
    }

    private class thirdHandler implements ItemListener{

        public void itemStateChanged(ItemEvent e) {
            Font font = null;
            if(boldbox.isSelected()&& italicbox.isSelected()){
                font = new Font("Serif", Font.BOLD + Font.ITALIC,14);
            }
            else if(boldbox.isSelected()){
                font = new Font("Serif", Font.BOLD ,14);
            }
            else if(italicbox.isSelected()){
                font = new Font("Serif", Font.ITALIC ,14);
            }
            else{
                font = new Font("Serif", Font.PLAIN,14);
            }
            tf.setFont(font);
        }

    }

}
