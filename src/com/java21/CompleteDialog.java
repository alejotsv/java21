package com.java21;

import javax.swing.*;
import java.util.ArrayList;

public class CompleteDialog extends JFrame {
    JPanel pane = new JPanel();
    String[] defaultLabels = { "Name: ", "URL: ", "Type: " };
    String[] responses = { "Alejo", "mysite.com", "awesome" };
    ArrayList<JLabel> labelArray;

    public CompleteDialog(){
        super("This is my box");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        TODO: create ArrayList of TextFields based on user input
        createLabels(defaultLabels);

        add(pane);
        setVisible(true);
        pack();
    }

    public void createLabels(String[] labelNames){
        int i = 0;
        for( String labelName : labelNames ){
            JLabel temp = new JLabel(labelName, SwingConstants.RIGHT);
//            TODO: replace hardcoded options with user input
            JTextField tempText = new JTextField(this.responses[i], 20);
            this.pane.add(temp);
            this.pane.add(tempText);
            i++;
        }
    }

    public void addLabels(ArrayList<JLabel> labels){
        for ( JLabel label : labels ){
            this.pane.add(label);
        }
    }

    public static void main(String[] args) {
        CompleteDialog myBox = new CompleteDialog();
    }
}
