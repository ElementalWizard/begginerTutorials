package GUI;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/**
 * Created by Elemental on 11/7/2016.
 */

public class FirstEventHandler extends JFrame{

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passf;

    public FirstEventHandler(){
        super("This is the event gui.");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("Enter text here");
        add(item2);

        item3 =  new JTextField("uneditable",20);
        item3.setEditable(false);
        add(item3);

        passf = new JPasswordField("mypass");
        add(passf);

        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passf.addActionListener(handler);

    }
    private class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent events){

            String string = "";
            if(events.getSource()==item1){
                string=String.format("field 1: %s", events.getActionCommand());
            }
            else if(events.getSource()==item2){
                string=String.format("field 2: %s", events.getActionCommand());
            }
            else if(events.getSource()==item3){
                string=String.format("field 3: %s", events.getActionCommand());
            }
            else if (events.getSource() == passf){
                string = String.format("pass field is: %s",events.getActionCommand());
            }

            JOptionPane.showMessageDialog(null,string);
        }
    }

}
