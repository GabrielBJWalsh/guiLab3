package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

class GameFrame extends JFrame {
    private JToggleButton pic0;
    private JToggleButton pic1;
    private JToggleButton pic2;
    private JToggleButton pic3;
    private JToggleButton pic4;
    private JToggleButton pic5;
    private Random randy = new Random();


    GameFrame() {
        GridLayout layout = new GridLayout();
        layout.setColumns(2);
        layout.setRows(2);
        setLayout(layout);

        final String[] selected = {null};
        ArrayList<JToggleButton> bList = new ArrayList<>();
        ArrayList<JToggleButton> bList2 = new ArrayList<>();

        //buttonSetUp(pic0, pic0, "cat.png", bList, bList2);
        //buttonSetUp(pic1, pic1, "dog.png", bList, bList2);
        //buttonSetUp(pic2, pic2, "lizard.png", bList, bList2);
        buttonSetUp(pic3, pic3, "bird.png", bList, bList2);
        buttonSetUp(pic4, pic4, "hamster.png", bList, bList2);
        buttonSetUp(pic5, pic5, "turtle.png", bList, bList2);

        Collections.shuffle(bList);
        Collections.shuffle(bList2);

        add(bList.get(0));
        add(bList2.get(0));
        add(bList.get(1));
        add(bList2.get(1));

        ActionListener listener = new ActionListener() {
            Object flag;

            public void actionPerformed(ActionEvent e) {
                if (selected[0] == null) {
                    selected[0] = e.getActionCommand();
                    flag = e.getSource();

                    System.out.println(e.getActionCommand());
                } else if (e.getActionCommand().equals(selected[0])) {
                    selected[0] = null;
                    System.out.println("match");
                    remove((Component) e.getSource());
                    remove((Component) flag);
                    flag = null;
                    try {
                        add(bList.get(2));
                        add(bList2.get(2));
                    } catch (Exception e2) {
                        System.out.println(e2.getMessage());
                    }
                    repaint();

                } else selected[0] = null;
                System.out.println("Button selected: " + e.getActionCommand());


            }
        };


        for (int i = 0; i < 3; i++) {
            bList.get(i).addActionListener(listener);
            bList2.get(i).addActionListener(listener);
        }

    }

    private void buttonSetUp(JToggleButton button,
                             JToggleButton button2,
                             String s,
                             ArrayList<JToggleButton> al,
                             ArrayList<JToggleButton> al2) {
        Icon i = new ImageIcon(getClass().getResource(("images\\" + s)));
        al.add(button = new JToggleButton(i));
        al2.add(button2 = new JToggleButton(i));
        button2.setActionCommand(s);
        button.setActionCommand(s);


    }

}