package com.java21;

import javax.swing.*;

public class ComboBoxExample extends JFrame {
    JPanel pane = new JPanel();

    public ComboBoxExample(String[] options){
        super("Color selection");
        setSize(500, 500);
        JComboBox colorSelection = new JComboBox(options);
        colorSelection.setSelectedIndex(2);
        JLabel label = new JLabel("Select a color");
        pane.add(label);
        pane.add(colorSelection);
        add(pane);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        String[] options = { "Blue", "Orange", "Yellow", "Gray" };
        ComboBoxExample combo = new ComboBoxExample(options);
    }
}
