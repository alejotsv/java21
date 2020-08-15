package com.java21;

import javax.swing.*;

public class AccountInfo extends JFrame {
    JPanel pane = new JPanel();

    public AccountInfo(){
        super("Account Information");
        setSize(300, 300);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        AccountInfo window = new AccountInfo();
    }
}
