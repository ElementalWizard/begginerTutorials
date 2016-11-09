package GUI;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Created by Elemental on 11/7/2016.
 */
public class JButtonss extends JFrame {

    private javax.swing.JButton reg;
    private javax.swing.JButton custom;

    public JButtonss(){
        super("This is the one with buttons");
        setLayout(new FlowLayout());

        reg = new JButton("reg Button");
        add(reg);

        Icon x = new ImageIcon(getClass().getResource("x.png"));
        Icon y = new ImageIcon(getClass().getResource("y.png"));

        custom = new JButton("Custom",x);
        custom.setRolloverIcon(y);
        add(custom);

        SecondEventHandler handler = new SecondEventHandler();
        reg.addActionListener(handler);
        custom.addActionListener(handler);

    }

    private class SecondEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null,String.format("%s", e.getActionCommand()));

        }
    }
}
