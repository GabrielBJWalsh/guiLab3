package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

class GameFrame extends JFrame {

    private Random randy = new Random();
    private ArrayList<JToggleButton> bList = new ArrayList<>();
    private ArrayList<JToggleButton> bList2 = new ArrayList<>();
    private boolean oneMatch = false;
    private ActionListener listener;

    GameFrame() {
                GridLayout layout = new GridLayout();
        layout.setColumns(2);
        layout.setRows(2);
        setLayout(layout);

        final String[] selected = {null};

        buttonSetUp("lizard.png", bList, bList2);
        buttonSetUp("bird.png", bList, bList2);

        boredsetUp();

        listener = new ActionListener() {
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
                    repaint();
                    if (oneMatch){
                        JOptionPane.showMessageDialog(null,"ya did it");
                        boredsetUp();

                        oneMatch ^=true;
                    }else oneMatch ^=true;





                    flag = null;

                } else selected[0] = null;
                System.out.println("Button selected: " + e.getActionCommand());


            }
        };

        for (int i = 0; i < bList.size(); i++) {
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
    private void boredsetUp(){
        int rand = randy.nextInt(2);
        int dinner;
        do {
            dinner = randy.nextInt(2);
        }while (rand == dinner);
        add(bList.get(rand));
        add(bList2.get(rand));

        add(bList.get(dinner));
        add(bList2.get(dinner));
        repaint();
        pack();
    }

}