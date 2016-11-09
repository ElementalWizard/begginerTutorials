package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Elemental on 11/8/2016.
 */
public class MouseEvents  extends JFrame {

    private JPanel mousepanel;
    private JLabel statusbar;


    public MouseEvents(){
        super("title");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar,BorderLayout.SOUTH);

        MHandlerClass handler = new MHandlerClass();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);


    }

    private class MHandlerClass implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            statusbar.setText(String.format("(click)Clicked at %d,%d",e.getX(),e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusbar.setText("(Press)You Pressed the mouse");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusbar.setText("(Release)You Released the mouse");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusbar.setText("(Entered)You have Entered :D");
            mousepanel.setBackground(Color.CYAN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusbar.setText("(Exited)You left... :( ... Im so lonely");
            mousepanel.setBackground(Color.ORANGE);
        }

        //these are mouse motion events
        @Override
        public void mouseDragged(MouseEvent e) {
            statusbar.setText("(dragging)HiHiHi That tickles");

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusbar.setText("(Moving)This is fun");

        }
    }


}
