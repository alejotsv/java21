package com.java21;

import javax.swing.*;

public class ListExample extends JFrame {
    JPanel pane = new JPanel();

    public ListExample(String[] arr){
        super("RSS Subscriptions");
        setSize(300, 700);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        String[] elements = { "Ideoplex", "Inessential", "Intertwingly", "Now This", "Rasterweb", "RC3", "Whole Lotta Nothing", "Workbench" };
        ListExample list = new ListExample(elements);
    }
}
