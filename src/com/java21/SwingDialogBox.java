package com.java21;

import javax.swing.*;
import java.awt.*;

public class SwingDialogBox extends JFrame {

    public static void main(String[] args) {
        SwingDialogBox thisBox = new SwingDialogBox();

    }

    public SwingDialogBox(){
        super("This is my new Dialog Box");
        setSize(600, 600);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gds = ge.getScreenDevices();
        GraphicsConfiguration gc = gds[2].getDefaultConfiguration();
        Rectangle rect = gc.getBounds();
        System.out.println(rect);
        int x = rect.getLocation().x;
        int y = rect.getLocation().y;
        this.setLocation(x + 660, 240);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



}
