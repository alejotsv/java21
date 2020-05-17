package com.java21;

import javax.swing.*;
import java.awt.*;

public class SwingDialogBox extends JFrame {

    public static void main(String[] args) {
        SwingDialogBox thisBox = new SwingDialogBox(600, 600, 1);

    }

    public SwingDialogBox(int x, int y, int monitor){
        super("This is my new Dialog Box");
        setSize(x, y);
        setPosition(x, y, monitor);
        setVisible(true);
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



}
