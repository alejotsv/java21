package com.java21;

import javax.swing.*;

public class CompleteDialog extends JFrame {
    JPanel pane = new JPanel();
    String[] defaultLabels = { "Name: ", "URL: ", "Type: " };

    public CompleteDialog(){
        super("This is my box");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createLabels(defaultLabels);
    }

    public void createLabels(String[] labels){
        for( String label : labels ){
            System.out.println(label);
        }
    }

    public static void main(String[] args) {
        CompleteDialog myBox = new CompleteDialog();
    }
}
