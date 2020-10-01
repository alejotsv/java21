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
        getResponse();
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

    public void getResponse() {
        System.out.println("Getting repsonses");
        this.responses[0] = JOptionPane.showInputDialog(null,
                "Enter your name: ",
                "Name",
                JOptionPane.QUESTION_MESSAGE);
        this.responses[1] = JOptionPane.showInputDialog(null,
                "Enter your site URL: ",
                "URL",
                JOptionPane.QUESTION_MESSAGE);
        this.responses[2] = JOptionPane.showInputDialog(null,
                "Enter your site type: ",
                "Type",
                JOptionPane.QUESTION_MESSAGE);
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
