package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Elemental on 11/8/2016.
 */


public class Adapclass extends JFrame {

    private String detail;
    private JLabel statusbar;

    public Adapclass(){
        super("title");

        statusbar = new JLabel("default");
        add(statusbar,BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());


    }
    private class Mouseclass extends MouseAdapter{
        //allow to override only the needed methods
        public void mouseClicked(MouseEvent e){
            detail = String.format("you clicked %d",e.getClickCount());

            if(e.isMetaDown()){
                detail+=" with right mouse button";
            }else if(e.isAltDown()){
                detail+=" with center mouse button";
            }else{
                detail+=" with left mouse button";
            }
            statusbar.setText(detail);

        }
    }

}
