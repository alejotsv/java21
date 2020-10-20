package com.java21;

import javax.swing.*;

public class TabbedPanesExample extends JFrame {

    String[] tabs = { "Real Madrid", "River Plate", "AC Milan"};

    public TabbedPanesExample(){
        super("Tabbed Panes");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tPane = new JTabbedPane();

        createTabs(this.tabs, tPane);


        add(tPane);
        setVisible(true);
    }

    void createTabs(String[] arr, JTabbedPane pane){
        for ( String string : arr ){
            JPanel temp = new JPanel();
            pane.addTab(string, temp);
        }

    }


    public static void main(String[] args){
        TabbedPanesExample tabs = new TabbedPanesExample();
    }
}
