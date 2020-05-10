package com.java21;

import javax.swing.*;

public class SwingExample extends JFrame {
    public static void main(String[] args) {
        SwingExample thisExample = new SwingExample();
    }

    public SwingExample() {
        super("Swing Example");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
