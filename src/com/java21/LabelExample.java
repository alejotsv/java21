package com.java21;

import javax.swing.*;
import java.awt.*;

public class LabelExample extends JFrame{
    JPanel panel = new JPanel();
    JLabel userLabel = new JLabel("User: ", SwingConstants.RIGHT);
    JLabel passwordLabel = new JLabel("Password: ", SwingConstants.LEFT);
    JLabel urlLabel = new JLabel("URL: ", SwingConstants.LEFT);

    public LabelExample(String title, Dimension dimensions){
        super(title);
        setSize(dimensions);
        add(panel);
        panel.add(userLabel);
        panel.add(passwordLabel);
        panel.add(urlLabel);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        System.out.println("This is my example for labels");
        Dimension dim = new Dimension(150, 150);
        LabelExample newLabel = new LabelExample("Labels", dim);
        System.out.println(newLabel.userLabel.getText());
    }
}
