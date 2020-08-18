package com.java21;

import javax.swing.*;

public class ScrollingPane extends JFrame {
    JPanel pane = new JPanel();

    public ScrollingPane(){
        super("Scrolling Pane Example");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args){
        ScrollingPane scroll = new ScrollingPane();
    }
}
