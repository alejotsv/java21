package com.java21;

import javax.swing.*;

public class ProgressBarExample extends JFrame {
    JPanel pane = new JPanel();
    JProgressBar pBar = new JProgressBar(1,100);

    public ProgressBarExample(){
        super("Progress Bar");
        setSize(250, 60);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pane.add(this.pBar);

        add(pane);

        setVisible(true);

        countNumbers(45);


    }

    void countNumbers(int num){
        int i = 0;
        while(i <= num){
            System.out.println(i);
            try {
                Thread.sleep(4000);
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
