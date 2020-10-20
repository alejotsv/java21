package com.java21;

import javax.swing.*;

public class MenuExample extends JFrame {
    JPanel pane = new JPanel();

    public MenuExample(){
        super("Menu example");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        MenuExample menu = new MenuExample();
    }
}
