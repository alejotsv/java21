package com.java21;

import javax.swing.*;

public class SliderExample extends JFrame {
    JPanel pane = new JPanel();
    public SliderExample(){
        super("This new slider");
        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JSlider slider = new JSlider(0, 100, 10);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
//        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        pane.add(slider);
        add(pane);
        setVisible(true);
    }

    public static void main(String[] args){
        System.out.println("My slider example");
        SliderExample mySlider = new SliderExample();
    }
}
