package com.java21;

import javax.swing.*;

public class TextAreaExample extends JFrame {
    JPanel pane = new JPanel();

    public TextAreaExample(){
        super("Text Area");
        setSize(300, 300);
        JLabel areaLabel = new JLabel("Comments:");
        JTextArea area = new JTextArea("Start typing...", 30, 20);
        pane.add(areaLabel);
        pane.add(area);
        add(pane);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        System.out.println("Hello Area");
        TextAreaExample textArea = new TextAreaExample();
    }

}
