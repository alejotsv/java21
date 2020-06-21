package com.java21;
import javax.swing.*;
import java.awt.*;

public class SimpleSwingApplication extends JFrame {
    public static void main(String[] args) {
        System.out.println("This is my simple Swing application");
        SimpleSwingApplication myApp = new SimpleSwingApplication("My App");
    }

    public SimpleSwingApplication(String title){
        super(title);
        setSize(300, 300);
        setVisible(true);
    }
}
