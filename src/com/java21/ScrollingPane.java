package com.java21;

import javax.swing.*;

public class ScrollingPane extends JFrame {
    JPanel pane = new JPanel();

    public ScrollingPane(){
        super("Scrolling Pane Example");
        setSize(300, 300);
        JLabel username = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);
        JLabel password = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setEchoChar('*');

        pane.add(username);
        pane.add(usernameField);
        pane.add(password);
        pane.add(passwordField);
        add(pane);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        ScrollingPane scroll = new ScrollingPane();
    }
}
