package com.java21;

import javax.swing.*;

public class ComboBoxExample extends JFrame {
    JPanel pane = new JPanel();

    public ComboBoxExample(String[] options){
        super("Color selection");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        String[] options = { "Blue", "Orange", "Yellow", "Gray" };
        ComboBoxExample combo = new ComboBoxExample(options);
    }
}
