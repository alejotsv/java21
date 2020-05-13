package com.java21;

import javax.swing.*;
import java.awt.*;
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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        String[] buttons = {"Upload", "Save", "Subscribe", "Unsubscribe"};
        JPanel pane = addButtons(buttons);
        addTextField("This is my text field", pane);
        JTextArea newArea = new JTextArea(6, 28);
        newArea.setLineWrap(true);
        newArea.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(newArea,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pane.add(scroll);
        add(pane);
        setVisible(true);
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

    JPanel addButtons(String[] buttonText){
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

    void addTextField(String text, JPanel panel){
        JTextField textField = new JTextField(text);
        textField.setEditable(false);
        panel.add(textField);
    }


}
