package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Elemental on 11/8/2016.
 */
public class ColorChooser extends JFrame {

    private JButton b;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public ColorChooser(){
        super("title");

        panel = new JPanel();
        panel.setBackground(color);

        b= new JButton("Choose a color");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color= JColorChooser.showDialog(null,"Choose a color",color);
                if(color==null){
                    color=(Color.WHITE);
                }
                panel.setBackground(color);
            }
        });

        add(panel,BorderLayout.CENTER);
        add(b,BorderLayout.SOUTH);

    }


}
