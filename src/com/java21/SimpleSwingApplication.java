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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
