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
        JMenu menu = new JMenu("Favorite Team");

        for ( String item : this.items ){
            JMenuItem temp = createMenuItem(item);
            menu.add(temp);
        }

        menuBar.add(menu);

        pane.add(menuBar);

        add(pane);

        setVisible(true);
    }

    public JMenuItem createMenuItem(String string){
        return new JMenuItem(string);
    }

    public static void main(String[] args) {
        MenuExample menu = new MenuExample();
    }
}
