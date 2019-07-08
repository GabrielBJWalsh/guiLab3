//package com.company;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//public class cheating {
////
////import java.awt.GridLayout;
////import java.awt.event.ActionEvent;
////import java.awt.event.ActionListener;
////
////import javax.swing.*;
////
////    public class ToggleArray extends JPanel {
////        private static final int SIDE = 5;
////
////        public ToggleArray() {
////            ActionListener listener = new ActionListener() {
////                public void actionPerformed(ActionEvent e) {
////                    System.out.println("Button selected: " + e.getActionCommand());
////                }
////            };
////
////            setLayout(new GridLayout(SIDE, SIDE));
////            ButtonGroup btnGroup = new ButtonGroup();
////            for (int i = 0; i < SIDE * SIDE; i++) {
////                String text = String.format("[%d, %d]", i % SIDE, i / SIDE);
////                JToggleButton btn = new JToggleButton(text);
////                btn.addActionListener(listener);
////                btnGroup.add(btn);
////                add(btn);
////            }
////        }
////
////        private static void createAndShowGui() {
////            ToggleArray mainPanel = new ToggleArray();
////
////            JFrame frame = new JFrame("ToggleArray");
////            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////            frame.getContentPane().add(mainPanel);
////            frame.pack();
////            frame.setLocationByPlatform(true);
////            frame.setVisible(true);
////        }
////
////        public static void main(String[] args) {
////            SwingUtilities.invokeLater(new Runnable() {
////                public void run() {
////                    createAndShowGui();
////                }
////            });
////        }
////    }
//}
//package com.company;
//
//        import javax.swing.*;
//        import java.awt.*;
//        import java.awt.event.ActionEvent;
//        import java.awt.event.ActionListener;
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.Iterator;
//
//class GameFrame extends JFrame {
//    private JToggleButton pic0;
//    private JToggleButton pic1;
//    private JToggleButton pic2;
//    private JToggleButton pic3;
//    private JToggleButton pic4;
//    private JToggleButton pic5;
//    private JToggleButton pic0_2;
//    private JToggleButton pic1_2;
//    private JToggleButton pic2_2;
//    private JToggleButton pic3_2;
//    private JToggleButton pic4_2;
//    private JToggleButton pic5_2;
//
//
//    GameFrame() {
//        setLayout(new GridLayout());
//
//        ActionListener listener = new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button selected: " + e.getActionCommand());
//            }
//        };
//
//        ArrayList<JToggleButton> bList = new ArrayList<>();
//        ArrayList<JToggleButton> bList2 = new ArrayList<>();
//
//        Icon icon0 = new ImageIcon(getClass().getResource("images\\cat.png"));
//        Icon icon1 = new ImageIcon(getClass().getResource("images\\dog.png"));
//        Icon icon2 = new ImageIcon(getClass().getResource("images\\lizard.png"));
//        Icon icon3 = new ImageIcon(getClass().getResource("images\\bird.png"));
//        Icon icon4 = new ImageIcon(getClass().getResource("images\\hamster.png"));
//        Icon icon5 = new ImageIcon(getClass().getResource("images\\turtle.png"));
//
//        bList.add(pic0 = new JToggleButton(icon0));
//        bList.add(pic1 = new JToggleButton(icon1));
//        bList.add(pic2 = new JToggleButton(icon2));
//        bList.add(pic3 = new JToggleButton(icon3));
//        bList.add(pic4 = new JToggleButton(icon4));
//        bList.add(pic5 = new JToggleButton(icon5));
//
//        bList2.add(pic0_2 = new JToggleButton(icon0));
//        bList2.add(pic1_2 = new JToggleButton(icon1));
//        bList2.add(pic2_2 = new JToggleButton(icon2));
//        bList2.add(pic3_2 = new JToggleButton(icon3));
//        bList2.add(pic4_2 = new JToggleButton(icon4));
//        bList2.add(pic5_2 = new JToggleButton(icon5));
//
//
//        add(pic0);
//        add(pic1);
//        add(pic3);
//        add(pic0_2);
//        //
//        //Buttonlistener  listener  = new Buttonlistener();
//
//        pic0.addActionListener(listener);
//        pic1.addActionListener(listener);
//        pic2.addActionListener(listener);
//        pic3.addActionListener(listener);
//        pic4.addActionListener(listener);
//        pic5.addActionListener(listener);
//
//        pic0_2.addActionListener(listener);
//        pic1_2.addActionListener(listener);
//        pic2_2.addActionListener(listener);
//        pic3_2.addActionListener(listener);
//        pic4_2.addActionListener(listener);
//        pic5_2.addActionListener(listener);
//
//
//
//
//        //Collections.shuffle(bList);
////        for (int i = 0; i < 4; i++) {
////            add(bList.get(i));
////    }
//
//
//
//    }
//    public void dothings(Icon i,){}
//
//
//}
//
