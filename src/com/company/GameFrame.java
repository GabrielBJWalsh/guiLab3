package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

/**
 * game frame class
 * used to create concentration game
 */

class GameFrame extends JFrame {

    private ArrayList<JToggleButton> bList = new ArrayList<>();
    private boolean oneMatch = false;
    private Object flag;

    /**
     * creates the games its self
     */
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
            /**
             * action listener takes in the action of a button stores it compaires it and rebuilds the frame
             * @param e
             */
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

    /**
     * takes a Image path string and forces the image to be of a particular size
     * @param imagePath
     * @return ImageIcon
     */
    private ImageIcon resizeImage(String imagePath) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image scaledIcon = icon.getImage().getScaledInstance(225, 300, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledIcon);
    }

    /**
     * takes string s to create image icon that is used to create a button that is then placed the arrrayList blist
     * @param s
     * @param al
     */
    private void buttonSetUp(String s,
                             ArrayList<JToggleButton> al) {
        for (int i = 0; i < 2; i++) {
            JToggleButton button;
            Icon con = resizeImage("images\\" + s);
            al.add(button = new JToggleButton(con));
            button.setActionCommand(s);
        }
    }

    /**
     * creates the game window with a random arrangement of buttons
     */
    private void boredsetUp() {
        Collections.shuffle(bList);
        for (JToggleButton button : bList) { add(button); }
        repaint();
        pack();
    }
}