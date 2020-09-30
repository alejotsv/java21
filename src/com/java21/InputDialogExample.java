package com.java21;

import javax.swing.*;

public class InputDialogExample extends JFrame {

    String response = JOptionPane.showInputDialog(null, "Enter your name",
            "Name box", JOptionPane.QUESTION_MESSAGE);

    public static void main(String[] arr){
        InputDialogExample inputExample = new InputDialogExample();
        System.out.println("Your name is: " + inputExample.response);
    }
}
