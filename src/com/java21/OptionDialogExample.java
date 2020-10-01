package com.java21;

import javax.swing.*;

public class OptionDialogExample extends JFrame {
    String gender = null;

    public OptionDialogExample(String title, String question, String[] options){
        int response = JOptionPane.showOptionDialog(null,
                question,
                title,
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if(response == 0){
            gender = "dude";
        } else if(response == 1){
            gender = "milady";
        } else {
            gender = "kind person";
        }

        String greeting = "Hello, " + gender + ".";

        JOptionPane.showMessageDialog(null,
                greeting,
                "Greeting",
                JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args){
        System.out.println("Start of app");
        String title = "Gender box";
        String question = "What is your gender?";
        String[] options = { "Male", "Female", "Other" };
        OptionDialogExample myBox = new OptionDialogExample(title, question, options);

    }
}
