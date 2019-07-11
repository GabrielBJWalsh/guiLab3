package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

class GameFrame extends JFrame {

    private ArrayList<JToggleButton> bList = new ArrayList<>();
    private boolean oneMatch = false;
    private Object flag;

    GameFrame() {

        final String[] selected = {null};
        GridLayout layout = new GridLayout();
        layout.setColumns(2);
        layout.setRows(2);
        setLayout(layout);

        buttonSetUp("lizard.png", bList);
        buttonSetUp("bird.png", bList);

        boredsetUp();


        ActionListener listener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (selected[0] == null) {
                    selected[0] = e.getActionCommand();
                    flag = e.getSource();
                } else if (e.getSource() == flag) {
                    flag = null;
                    selected[0] = null;
                } else if (e.getActionCommand().equals(selected[0])) {
                    selected[0] = null;
                    remove((Component) e.getSource());
                    remove((Component) flag);
                    repaint();
                    if (oneMatch) {
                        JOptionPane.showMessageDialog(null, "ya did it");
                        boredsetUp();

                        oneMatch ^= true;
                    } else oneMatch = true;
                    flag = null;

                } else {
                    selected[0] = null;
                    JOptionPane.showMessageDialog(null, "wrong one dumb dumb");
                }
            }
        };
        for (JToggleButton button : bList) { button.addActionListener(listener); }
    }

    private ImageIcon resizeImage(String imagePath) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image scaledIcon = icon.getImage().getScaledInstance(225, 300, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledIcon);
    }

    private void buttonSetUp(String s,
                             ArrayList<JToggleButton> al) {
        for (int i = 0; i < 2; i++) {
            JToggleButton button;
            Icon con = resizeImage("images\\" + s);
            al.add(button = new JToggleButton(con));
            button.setActionCommand(s);
        }
    }

    private void boredsetUp() {
        Collections.shuffle(bList);
        for (JToggleButton button : bList) { add(button); }
        repaint();
        pack();
    }
}