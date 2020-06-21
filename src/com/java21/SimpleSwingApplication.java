package com.java21;
import javax.swing.*;
import java.awt.*;

public class SimpleSwingApplication extends JFrame {
    public static void main(String[] args) {
        System.out.println("This is my simple Swing application");
        SimpleSwingApplication myApp = new SimpleSwingApplication("My App", 500, 500);
    }

    public SimpleSwingApplication(String title, int x, int y){
        super(title);
        Dimension dimension = new Dimension(x, y);
        setSize(dimension);
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private static void setLookAndFeel() {
        String look = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
        try {
            UIManager.setLookAndFeel(look);
            System.out.println("Current look: " + look);
        } catch (Exception e) {
            System.out.println("Look and feel " + look + " not found");
        }
    }
}
