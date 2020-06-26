package com.java21;
import javax.swing.*;
import java.awt.*;

public class SimpleSwingApplication extends JFrame {
    JPanel pane = new JPanel();
    JButton save = new JButton("Save");
    JButton cancel = new JButton("Cancel");

    public SimpleSwingApplication(String title, int x, int y, String[] buttons){
        super(title);
        Dimension dimension = new Dimension(x, y);
        setSize(dimension);
        setButtons(buttons);
        add(pane);
        pack();
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

    public void setButtons(String[] buttons){
        String path  = "/home/alejotsv/code/java/java21/global21/src/com/java21/img/";
        for (String button : buttons){
            String completePath = path + button.toLowerCase() + ".png";
            ImageIcon icon = new ImageIcon(completePath);
            JButton temp = new JButton(button, icon);
            pane.add(temp);
        }
    }

    public static void main(String[] args) {
        System.out.println("This is my simple Swing application");
        String[] buttons = { "Save" };
        SimpleSwingApplication myApp = new SimpleSwingApplication("My App", 500, 500, buttons);
    }
}
