package com.java21;

import javax.swing.*;
import java.awt.*;

public class LabelExample extends JFrame{
    JPanel panel = new JPanel();

    public LabelExample(String title, Dimension dimensions){
        super(title);
        setSize(dimensions);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        System.out.println("This is my example for labels");
        Dimension dim = new Dimension(150, 150);
        LabelExample newLabel = new LabelExample("Labels", dim);
    }
}
