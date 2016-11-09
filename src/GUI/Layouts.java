package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Elemental on 11/8/2016.
 */
public class Layouts extends JFrame {

    private JButton lbutt;
    private JButton cbutt;
    private JButton rbutt;
    private FlowLayout layout;
    private Container container;

    public Layouts(){
        super("title");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        lbutt = new JButton("left");
        add(lbutt);
        lbutt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.LEFT);
                layout.layoutContainer(container);
            }
        });

        cbutt = new JButton("center");
        add(cbutt);
        cbutt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.CENTER);
                layout.layoutContainer(container);
            }
        });

        rbutt = new JButton("right");
        add(rbutt);
        rbutt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.RIGHT);
                layout.layoutContainer(container);
            }
        });




    }

}
