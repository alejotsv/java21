package com.java21;

import javax.swing.*;

public class ToolBarExample extends JFrame {
    JPanel pane = new JPanel();
    String path = "/home/alejotsv/code/java/java21/global21/src/com/java21/img/";

    public ToolBarExample(){
        super("This is a ToolBar");
        setSize(400,400);

        ImageIcon downloadIcon = new ImageIcon(this.path + "save.png");
        JButton downloadButton = new JButton("Download", downloadIcon);
        ImageIcon uploadIcon = new ImageIcon(this.path + "upload.png");
        JButton uploadButton = new JButton("Upload", uploadIcon);

        JToolBar toolBar = new JToolBar();

        toolBar.add(downloadButton);
        toolBar.add(uploadButton);

        pane.add(toolBar);


        add(pane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args){
        ToolBarExample toolBar = new ToolBarExample();
    }
}
