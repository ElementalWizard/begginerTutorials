package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Elemental on 11/8/2016.
 */


public class MoarDraweng  extends JPanel {


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.drawLine(10,25,200,45);

        g.setColor(Color.RED);
        g.drawRect(10,55,25,25);

        g.setColor(Color.GREEN);
        g.fillOval(10,95,25,25);

        g.setColor(Color.CYAN);
        g.fill3DRect(10,160,50,50,true);


    }
}
