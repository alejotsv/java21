package com.java21;

import javax.swing.*;

public class AccountInfo extends JFrame {
    JPanel pane = new JPanel();

    public AccountInfo(){
        super("Account Information");
        setSize(300, 180);
//        Create labels
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel commentsLabel = new JLabel("Comments:");
//        Create fields
        JTextField username = new JTextField(15);
        JPasswordField password = new JPasswordField(15);
        password.setEchoChar('*');
        JTextArea comments = new JTextArea(4,15);
//        Create buttons
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");
//        Add labels, fields, and buttons to pane
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
        pane.add(commentsLabel);
        pane.add(comments);
        pane.add(ok);
        pane.add(cancel);
//        Add pane
        add(pane);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        AccountInfo window = new AccountInfo();
    }
}
