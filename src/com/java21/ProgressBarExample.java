package com.java21;

import javax.swing.*;

public class ProgressBarExample extends JFrame {
    JPanel pane = new JPanel();
    JProgressBar pBar = new JProgressBar();

    public ProgressBarExample(){
        super("Progress Bar");
        setSize(250, 60);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pBar.setStringPainted(true);
        pane.add(this.pBar);
        add(pane);
        setVisible(true);

        countNumbers(45);


    }

    void countNumbers(int num){
        this.pBar.setMinimum(0);
        this.pBar.setMaximum(num);
        int i = 0;
        while(i <= num){
            this.pBar.setValue(i);
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }

    public static void main(String[] args){
        ProgressBarExample bar = new ProgressBarExample();
    }
}
