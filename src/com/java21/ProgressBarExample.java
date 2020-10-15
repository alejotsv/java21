package com.java21;

import javax.swing.*;

public class ProgressBarExample extends JFrame {
    JPanel pane = new JPanel();

    public ProgressBarExample(){
        super("Progress Bar");
        System.out.println("This is a progress bar");
        countNumbers(45);

    }

    void countNumbers(int num){
        int i = 0;
        while(i <= num){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args){
        ProgressBarExample bar = new ProgressBarExample();
    }
}
