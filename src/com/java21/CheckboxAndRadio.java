package com.java21;

import javax.swing.*;
import java.util.ArrayList;

public class CheckboxAndRadio extends JFrame {
    JPanel pane = new JPanel();

    public CheckboxAndRadio(String[] buttons, String[] radioButtons){
        super("Checkbox and Radio buttons example");
        setSize(300, 300);
        ArrayList<JCheckBox> components = addCheckBoxes(buttons);
        for ( JCheckBox component : components ){
            pane.add(component);
        }
        add(pane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public ArrayList<JCheckBox> addCheckBoxes(String[] buttons){
        ArrayList<JCheckBox> components = new ArrayList<>();
        int index = 0;
        for( String button : buttons ){
            if (index == 0){
                JCheckBox temp = new JCheckBox(button, true);
                components.add(temp);
            } else {
                JCheckBox temp = new JCheckBox(button);
                components.add(temp);
            }
            index++;
        }
        return components;
    }

    public ButtonGroup addRadioButtons(String[] radioButtons){
        ButtonGroup radio = new ButtonGroup();
        int index = 0;
        for ( String button : radioButtons ){
            if (index == 0){
                JRadioButton temp = new JRadioButton(button, true);
                radio.add(temp);
            } else {
                JRadioButton temp = new JRadioButton(button, false);
                radio.add(temp);
            }
            index++;
        }
        return radio;
    }


    public static void main(String[] args){
        String[] checkButtons = { "Orange", "Blue", "Black", "Blue"};
        String[] radioButtons = { "Dell", "Lenovo Thinkpad", "Lenovo Yoga"};
        CheckboxAndRadio panel = new CheckboxAndRadio(checkButtons, radioButtons);
    }
}
