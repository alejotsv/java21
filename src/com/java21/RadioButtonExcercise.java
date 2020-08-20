package com.java21;

import javax.swing.*;

public class RadioButtonExcercise extends JFrame {
    JPanel pane = new JPanel();

    public RadioButtonExcercise(){
        super("Choose an Output Format");
        setSize(400,100);
        ButtonGroup buttons = new ButtonGroup();
        JRadioButton button1 = new JRadioButton("Atom", true);
        JRadioButton button2 = new JRadioButton("RSS 0.92");
        JRadioButton button3 = new JRadioButton("RSS 1.0");
        JRadioButton button4 = new JRadioButton("RSS 2.0");
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        JLabel label = new JLabel("Choose an output format for syndicated news items");
        pane.add(label);
        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(button4);
        add(pane);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        RadioButtonExcercise buttons = new RadioButtonExcercise();
    }
}
