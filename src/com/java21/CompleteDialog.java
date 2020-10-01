package com.java21;

import javax.swing.*;

public class CompleteDialog extends JFrame {
    JPanel pane = new JPanel();

    public CompleteDialog(){
        super("This is my box");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CompleteDialog myBox = new CompleteDialog();
    }
}
