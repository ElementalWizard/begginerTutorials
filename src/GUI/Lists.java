package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Created by Elemental on 11/8/2016.
 */
public class Lists extends JFrame{

    private JList list;

    private static String[] colorn = {"black","blue","red","white"};
    private static Color[] colors = {Color.BLACK,Color.BLUE,Color.RED,Color.WHITE};

    public Lists(){
        super("title");
        setLayout(new FlowLayout());

        list = new JList(colorn);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(colors[list.getSelectedIndex()]);

            }
        });





    }









}
