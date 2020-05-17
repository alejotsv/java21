package com.java21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class SwingDialogBox extends JFrame {

    public static void main(String[] args) {
        SwingDialogBox thisBox = new SwingDialogBox(600, 600, 2);

    }

    public SwingDialogBox(int x, int y, int monitor){
        super("My Pets");
        setSize(x, y);
        setPosition(x, y, monitor);
        setVisible(true);
//        int response = addConfirmDialog();
        String petName = myPetName();
        String petType = addOptionDialogBox();
        thankYouMessage(petName);
        JButton yourPet = addAnimalButton(petName,petType);
        JPanel petPanel = new JPanel();
        petPanel.add(yourPet);
        add(petPanel);
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

    int addConfirmDialog(){
        return JOptionPane.showConfirmDialog(this, "Do you want to do this?", "The title of my box", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
    }

    String myPetName(){
        return JOptionPane.showInputDialog(this, "Pet name", "Input pet name", JOptionPane.QUESTION_MESSAGE);
    }

    String addOptionDialogBox(){
        String[] options = { "Creature", "Animal", "Mythological" };
        int randomOption = (int)(Math.random()*3);
        int petNum = JOptionPane.showOptionDialog(this, "Select your type of pet", "Your pet", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[randomOption]);
        return options[petNum];
    }

    void thankYouMessage(String petName){
        String message = "You have created your pet " + petName;
        JOptionPane.showMessageDialog(this, message);
    }

    JButton addAnimalButton(String petName, String petType){
        String iconName = "./img/" + petType.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(iconName));
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);
        JButton petButton = new JButton(petName, resizedIcon);
        petButton.setSize(30, 30);
        return petButton;
    }


}
