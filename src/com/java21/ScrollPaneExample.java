package com.java21;

import javax.swing.*;
import java.awt.*;

public class ScrollPaneExample extends JFrame {
    JPanel pane = new JPanel();
    Dimension dim = new Dimension(400,400);
    Dimension scrollDim = new Dimension(200,200);

    public ScrollPaneExample(){
        super("This is the scroll example");
        setSize(this.dim);
        JTextArea textArea = new JTextArea(7, 10);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(this.scrollDim);

        pane.add(scrollPane);
        add(pane);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ScrollPaneExample scroller = new ScrollPaneExample();
    }
}
