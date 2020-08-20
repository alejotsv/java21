package com.java21;

import javax.swing.*;

public class ListExample extends JFrame {
    JPanel pane = new JPanel();

    public ListExample(String[] arr){
        super("RSS Subscriptions");
        setSize(200, 300);
        JList<String> list = new JList<>(arr);
        list.setVisibleRowCount(4);
        JScrollPane scroll = new JScrollPane(list, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JLabel label = new JLabel("RSS Subscriptions");
        pane.add(label);
        pane.add(scroll);
        add(pane);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        String[] elements = { "Ideoplex", "Inessential", "Intertwingly", "Now This", "Rasterweb", "RC3", "Whole Lotta Nothing", "Workbench" };
        ListExample list = new ListExample(elements);
    }
}
