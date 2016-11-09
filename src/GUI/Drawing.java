package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by Elemental on 11/8/2016.
 */
public class Drawing  extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(0,0,30,30);

        g.setColor(new Color(190,81,215));
        g.fillOval(31,0,30,30);

        g.setColor(Color.RED);
        g.drawString("Magic String",62,12);

    }




}
