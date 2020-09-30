package com.java21;

import javax.swing.*;

public class InputDialogExample extends JFrame {

    String response = JOptionPane.showInputDialog(null, "Enter your name",
            "Name box", JOptionPane.QUESTION_MESSAGE);

    public void sayHello(){
        String hello = "Hello, " + this.response;
        JOptionPane.showMessageDialog(null,
                hello,
                "Greetings",
                JOptionPane.PLAIN_MESSAGE);
    }


    public static void main(String[] arr){
        InputDialogExample inputExample = new InputDialogExample();
        inputExample.sayHello();
    }
}
