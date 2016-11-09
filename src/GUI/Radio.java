package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

/**
 * Created by Elemental on 11/7/2016.
 */
public class Radio extends JFrame{
    private JTextField tf;
    private Font pf,bf,itf,bif;
    private JRadioButton pb,bb,ib,bib;
    private ButtonGroup group;

    public Radio(){
        super("Radio gui");
        setLayout(new FlowLayout());
        tf = new JTextField("This is a sentance",25);
        add(tf);

        pb=new JRadioButton("plain",true);
        bb=new JRadioButton("bold",false);
        ib=new JRadioButton("italic",false);
        bib=new JRadioButton("both",false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        pf = new Font("Serif", Font.PLAIN,14);
        bf=new Font("Serif", Font.BOLD ,14);
        itf= new Font("Serif", Font.ITALIC ,14);
        bif=new Font("Serif", Font.BOLD + Font.ITALIC,14);

        tf.setFont(pf);

        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));


    }

    private class HandlerClass implements ItemListener{
        private Font font;
        public HandlerClass(Font f){
            font = f;
        }

        public void itemStateChanged(ItemEvent e) {
            tf.setFont(font);
        }
    }

}
