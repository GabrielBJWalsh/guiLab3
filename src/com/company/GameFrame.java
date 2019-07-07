package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class GameFrame extends JFrame {
    private JButton pic0;
    private JButton pic1;
    private JButton pic2;
    private JButton pic3;
    private JButton pic4;
    private JButton pic5;

    GameFrame() {
        setLayout(new GridLayout());

        ArrayList<JButton> bList = new ArrayList<JButton>();
        //Iterator iterator = bList.iterator();

        buttonSetUp(pic0, "cat.png", bList);
        buttonSetUp(pic1, "dog.png", bList);
        buttonSetUp(pic2, "lizard.png", bList);
        buttonSetUp(pic3, "bird.png", bList);
        buttonSetUp(pic4, "hamster.png", bList);
        buttonSetUp(pic5, "turtle.png", bList);

       // addition = (int a, int b) -> (a + b);

        Collections.shuffle(bList);
        System.out.println(bList);
        for (int i = 0; i < 4; i++) {
            add(bList.get(i));
        }

    }

    private void buttonSetUp(JButton button, String s, ArrayList<JButton> al) {
        Icon i = new ImageIcon(getClass().getResource(("images\\" + s)));
        al.add(button = new JButton(i));

    }

}
