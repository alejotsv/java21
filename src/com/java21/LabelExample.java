package com.java21;

import javax.swing.*;
import java.awt.*;

public class LabelExample extends JFrame{
    JPanel panel = new JPanel();
    JLabel userLabel = new JLabel("User: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel urlLabel = new JLabel("URL: ");

    public LabelExample(String title, Dimension dimensions){
        super(title);
        setSize(dimensions);
        add(panel);
        panel.add(userLabel);
        panel.add(passwordLabel);
        panel.add(urlLabel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        System.out.println("This is my example for labels");
        Dimension dim = new Dimension(150, 150);
        LabelExample newLabel = new LabelExample("Labels", dim);
    }
}
