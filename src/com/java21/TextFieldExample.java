package com.java21;

import javax.swing.*;
import java.util.ArrayList;

public class TextFieldExample extends JFrame {
    JPanel pane = new JPanel();

    public TextFieldExample(String[] arr){
        super("Text fields example");
        setSize(400, 400);
        ArrayList<JTextField> fields = setFields(arr);
        for ( JTextField field : fields ){
            pane.add(field);
        }
        add(pane);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    ArrayList<JTextField> setFields(String[] arr){
        ArrayList<JTextField> textArr = new ArrayList<>();
        for(String element : arr){
            JTextField temp = new JTextField(element, 10);
            textArr.add(temp);
        }
        return textArr;
    }

    public static void main(String[] args){
        String[] arr = { "Name", "Last Name", "Favorite Teams"};
        TextFieldExample field = new TextFieldExample(arr);
    }
}
