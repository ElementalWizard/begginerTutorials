package GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Elemental on 11/8/2016.
 */
public class MultipleLists extends JFrame{

    private JList llist;
    private JList rlist;

    private JButton movebutt;
    private static String[] foods = {"bacon","wings","ham","beef","more bacon"};

    public MultipleLists(){
        super("title");
        setLayout(new FlowLayout());

        llist = new JList(foods);
        llist.setVisibleRowCount(3);
        llist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(llist));


        movebutt = new JButton("Move -->");
        movebutt.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                rlist.setListData(llist.getSelectedValues());
            }
        });
        add(movebutt);
        rlist = new JList();
        rlist.setVisibleRowCount(3);
        rlist.setFixedCellWidth(100);
        rlist.setFixedCellHeight(20);
        rlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rlist));



    }









}
