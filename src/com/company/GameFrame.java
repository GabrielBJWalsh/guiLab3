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

    private Random randy = new Random();

    private int rand;
    private int dnar;
    private int dinner;
    private ArrayList<JToggleButton> onFrame;


    GameFrame() {
        GridLayout layout = new GridLayout();
        layout.setColumns(2);
        layout.setRows(2);
        setLayout(layout);

        final String[] selected = {null};
        ArrayList<JToggleButton> bList = new ArrayList<>();
        ArrayList<JToggleButton> bList2 = new ArrayList<>();

        buttonSetUp("cat.png", bList, bList2);
        buttonSetUp("dog.png", bList, bList2);
        buttonSetUp("lizard.png", bList, bList2);
        buttonSetUp("bird.png", bList, bList2);
        buttonSetUp("hamster.png", bList, bList2);
        buttonSetUp("turtle.png", bList, bList2);

        //Collections.shuffle(bList);
        //Collections.shuffle(bList2);
        rand = randy.nextInt(6);
        dinner = randy.nextInt(6);
        dnar = randy.nextInt(6);
        onFrame = new ArrayList<>();
        add(bList.get(rand));
        onFrame.add(bList.get(rand));

        add(bList2.get(rand));
        onFrame.add(bList2.get(rand));

        add(bList.get(dinner);
        onFrame.add(bList.get(rand));

        add(bList2.get(dnar));
        onFrame.add(bList.get(rand));
        //pack();

        ActionListener listener = new ActionListener() {
            Object flag;


            public void actionPerformed(ActionEvent e) {
                if (selected[0] == null) {
                    selected[0] = e.getActionCommand();
                    flag = e.getSource();

                    System.out.println(e.getActionCommand());
                } else if (e.getSource() == flag) {
                    flag = null;
                    selected[0] = null;
                } else if (e.getActionCommand().equals(selected[0])) {
                    selected[0] = null;
                    System.out.println("match");
                    remove((Component) e.getSource());
                    remove((Component) flag);
                    //repaint();4
                    rand = randy.nextInt(6);
                    add(bList.get(rand));
                    add(bList2.get(rand));
                    pack();

                    flag = null;

                } else selected[0] = null;
                System.out.println("Button selected: " + e.getActionCommand());


            }
        };


        for (int i = 0; i < 6; i++) {
            bList.get(i).addActionListener(listener);
            bList2.get(i).addActionListener(listener);
        }

    }

    private ImageIcon resizeImage(String imagePath) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image scaledIcon = icon.getImage().getScaledInstance(225, 300, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledIcon);
    }

    private void buttonSetUp(String s,
                             ArrayList<JToggleButton> al,
                             ArrayList<JToggleButton> al2) {
        JToggleButton button;
        JToggleButton button2;
        Icon i = resizeImage("images\\" + s);
        al.add(button = new JToggleButton(i));
        al2.add(button2 = new JToggleButton(i));
        button2.setActionCommand(s);
        button.setActionCommand(s);


    }

}