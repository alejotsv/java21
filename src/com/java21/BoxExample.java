package com.java21;

import javax.swing.*;

public class BoxExample extends JFrame {

    public BoxExample(){
        super("This is a box example");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
        pane.setLayout(box);

        JButton rm = new JButton("Real Madrid");
        JButton rp = new JButton("River Plate");
        JButton ac = new JButton("AC Milan");

        pane.add(rm);
        pane.add(rp);
        pane.add(ac);




        add(pane);

        setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println("What's in the box!");
        BoxExample box = new BoxExample();
    }
}
