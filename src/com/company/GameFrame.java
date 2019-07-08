package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class GameFrame extends JFrame {
    private JToggleButton pic0;
    private JToggleButton pic1;
    private JToggleButton pic2;
    private JToggleButton pic3;
    private JToggleButton pic4;
    private JToggleButton pic5;
    private JToggleButton pic0_2;
    private JToggleButton pic1_2;
    private JToggleButton pic2_2;
    private JToggleButton pic3_2;
    private JToggleButton pic4_2;
    private JToggleButton pic5_2;


    GameFrame() {
        GridLayout layout = new GridLayout();
        layout.setColumns(2);
        layout.setRows(2);
        setLayout(layout);
        final String[] selected = {null};
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                if (selected[0] ==null){
//                    selected[0] = e.getActionCommand();
//                };
                System.out.println("Button selected: " + e.getActionCommand());

                // crate SelectCheckVarable then if not null
            }
        };

        ArrayList<JToggleButton> bList = new ArrayList<>();
        ArrayList<JToggleButton> bList2 = new ArrayList<>();

        buttonSetUp(pic0, "cat.png", bList);
        buttonSetUp(pic1, "dog.png", bList);
        buttonSetUp(pic2, "lizard.png", bList);
        buttonSetUp(pic3, "bird.png", bList);
        buttonSetUp(pic4, "hamster.png", bList);
        buttonSetUp(pic5, "turtle.png", bList);
        buttonSetUp(pic0, "cat.png", bList2);
        buttonSetUp(pic1, "dog.png", bList2);
        buttonSetUp(pic2, "lizard.png", bList2);
        buttonSetUp(pic3, "bird.png", bList2);
        buttonSetUp(pic4, "hamster.png", bList2);
        buttonSetUp(pic5, "turtle.png", bList2);

        add(bList.get(0));
        add(bList.get(4));
        add(bList.get(5));
        add(bList2.get(5));
        //
        //Buttonlistener  listener  = new Buttonlistener();

        for (int i =0; i>5; i++){
            bList.get(i).addActionListener(listener);
            bList.get(i).setActionCommand("i used to work");
            bList2.get(i).addActionListener(listener);
        }
        //JToggleButton listner


        Collections.shuffle(bList);
//        for (int i = 0; i < 4; i++) {
//            add(bList.get(i));
//    }


    }

    private void buttonSetUp(JToggleButton button, String s, ArrayList<JToggleButton> al) {
        Icon i = new ImageIcon(getClass().getResource(("images\\" + s)));
        al.add(button = new JToggleButton(i));
       // button.setActionCommand(s);



    }

}