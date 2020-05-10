package com.java21;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SwingExample extends JFrame {
    public static void main(String[] args) {
        SwingExample thisExample = new SwingExample();
        System.out.println(UIManager.getLookAndFeel());
    }

    public SwingExample() {
        super("Swing Example");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ArrayList<String> allLooks = new ArrayList<String>();
        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo look : looks){
            System.out.println(look.getClassName());
            allLooks.add(look.getClassName());
        }
        try {
        UIManager.setLookAndFeel(allLooks.get(2));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
