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
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        String[] buttons = {"Upload", "Save", "Subscribe", "Unsubscribe"};
        JPanel pane = AddButtons(buttons);
        add(pane);
        pack();
    }

    ArrayList<String> getLAF() {
        ArrayList<String> allLooks = new ArrayList<String>();
        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo look : looks) {
            System.out.println(look.getClassName());
            allLooks.add(look.getClassName());
        }
        return allLooks;
    }

    void setLAF(String look) {
        try {
            UIManager.setLookAndFeel(look);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    JPanel AddButtons(String[] buttonText){
        JPanel pane = new JPanel();
        ArrayList<String> temp = new ArrayList<>(Arrays.asList(buttonText));
        String iconName;
        for (String text : temp){
            iconName = "./img/" + text.toLowerCase() + ".png";
            ImageIcon icon = new ImageIcon(getClass().getResource(iconName));
            pane.add(new JButton(text,icon));
        }
        return pane;
    }


}
