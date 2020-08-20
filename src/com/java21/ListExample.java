package com.java21;

import javax.swing.*;

public class ListExample extends JFrame {
    JPanel pane = new JPanel();

    public ListExample(){
        super("RSS Subscriptions");
        setSize(300, 700);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ListExample list = new ListExample();
    }
}
