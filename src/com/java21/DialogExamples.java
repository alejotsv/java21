package com.java21;

import javax.swing.*;
import java.awt.*;

public class DialogExamples extends JFrame {

    public DialogExamples(){
        super();
        int response = JOptionPane.showConfirmDialog(null,
                "There was an error",
                "File error",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args){
        DialogExamples box = new DialogExamples();
    }
}
