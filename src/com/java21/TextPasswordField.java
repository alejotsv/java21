package com.java21;

import javax.swing.*;

public class TextPasswordField extends JFrame {
    JPanel pane = new JPanel();

    public TextPasswordField(){
        super("Password field");
        setSize(240, 240);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TextPasswordField passwordField = new TextPasswordField();
    }
}
