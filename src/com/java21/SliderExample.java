package com.java21;

import javax.swing.*;

public class SliderExample extends JFrame {
    JPanel pane = new JPanel();
    public SliderExample(){
        super("This new slider");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JSlider slider = new JSlider();
    }

    public static void main(String[] args){
        System.out.println("My slider example");
        SliderExample mySlider = new SliderExample();
    }
}
