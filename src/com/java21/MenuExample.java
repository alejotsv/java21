package com.java21;

import javax.swing.*;

public class MenuExample extends JFrame {
    JPanel pane = new JPanel();
    String[] items = { "Real Madrid", "AC Milan", "River Plate" };

    public MenuExample(){
        super("Menu example");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        for ( String item : this.items ){
            createMenuItem(item);
        }

        setVisible(true);
    }

    public JMenuItem createMenuItem(String string){
        return new JMenuItem(string);
    }

    public static void main(String[] args) {
        MenuExample menu = new MenuExample();
    }
}
