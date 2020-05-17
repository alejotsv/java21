package com.java21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class SwingDialogBox extends JFrame {

    public static void main(String[] args) {
        SwingDialogBox thisBox = new SwingDialogBox(600, 600, 2);

    }

    public SwingDialogBox(int x, int y, int monitor){
        super("This is my new Dialog Box");
        setSize(x, y);
        setPosition(x, y, monitor);
        setVisible(true);
//        int response = addConfirmDialog();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void setPosition(int x, int y, int monitor){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gds = ge.getScreenDevices();
        GraphicsConfiguration gc = gds[monitor].getDefaultConfiguration();
        Rectangle rect = gc.getBounds();
        int finalX = rect.getLocation().x + ((int)rect.getWidth() - x)/2;
        int finalY = rect.getLocation().y + ((int)rect.getHeight() - y)/2;
        this.setLocation(finalX, finalY);
    }

    int addConfirmDialog(){
        return JOptionPane.showConfirmDialog(this, "Do you want to do this?", "The title of my box", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
    }

    String getUserName(){
        return JOptionPane.showInputDialog(this, "Name", "Input username", JOptionPane.QUESTION_MESSAGE);
    }



}
