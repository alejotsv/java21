package com.java21;

import javax.swing.*;
import java.awt.*;

public class LayoutExample extends JFrame {

    public LayoutExample(){
        super("This flow is here");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
        setLayout(flow);

        JLabel team = new JLabel("Real Madrid");

        add(team);

        setVisible(true);
    }

    public static void main(String[] args){
        System.out.println("This is working");
        LayoutExample layout = new LayoutExample();
    }
}
