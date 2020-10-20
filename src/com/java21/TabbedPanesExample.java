package com.java21;

import javax.swing.*;

public class TabbedPanesExample extends JFrame {
    JPanel pane = new JPanel();

    public TabbedPanesExample(){
        super("Tabbed Panes");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }


    public static void main(String[] args){
        TabbedPanesExample tabs = new TabbedPanesExample();
    }
}
