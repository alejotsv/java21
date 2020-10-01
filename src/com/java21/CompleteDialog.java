package com.java21;

import javax.swing.*;
import java.util.ArrayList;

public class CompleteDialog extends JFrame {
    JPanel pane = new JPanel();
    String[] defaultLabels = { "Name: ", "URL: ", "Type: " };
    ArrayList<JLabel> labelArray;

    public CompleteDialog(){
        super("This is my box");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createLabels(defaultLabels);

        add(pane);
    }

    public void createLabels(String[] labelNames){
        for( String labelName : labelNames ){
            JLabel temp = new JLabel(labelName, SwingConstants.RIGHT);
            this.pane.add(temp);
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
