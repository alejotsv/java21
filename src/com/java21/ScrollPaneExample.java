package com.java21;

import javax.swing.*;
import java.awt.*;

public class ScrollPaneExample extends JFrame {
    JPanel pane = new JPanel();
    Dimension dim = new Dimension(400,400);

    public ScrollPaneExample(){
        super("This is the scroll example");
        setSize(this.dim);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ScrollPaneExample scroller = new ScrollPaneExample();
    }
}
