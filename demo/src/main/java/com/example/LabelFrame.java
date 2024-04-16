package com.example;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class LabelFrame extends JFrame {
    // Get the screen size
    public LabelFrame() {

        ImageIcon icon = new ImageIcon("demo/src/main/resources/64211552.jpg");// create an ImageIcon
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);// create a border
        JLabel label = new JLabel();// create a label
        label.setText("Hello, World!");// set text of label
        label.setIcon(icon);// set icon to label
        label.setHorizontalTextPosition(JLabel.CENTER);// set text LEFT, CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP);// set text TOP, CENTER, BOTTOM of image icon
        label.setForeground(new Color(Color.MAGENTA.getRGB()));// set font color of text
        label.setFont(new Font("MV Boli", Font.ITALIC, 50));// set font of text
        label.setIconTextGap(10);// set gap of text to image
        label.setBackground(Color.BLACK);// set background color
        label.setOpaque(true);// display background color
        label.setBorder(border);// set border
        label.setVerticalAlignment(JLabel.CENTER);// set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position of icon+text within label
        // label.setBounds(100,100,250,250);//set x,y position within frame as well as
        // dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// get screen size
        int screenWidth = (int) screenSize.getWidth();// get screen width
        int screenHeight = (int) screenSize.getHeight();// get screen height

        this.setTitle("JFrame Example");// set title of frame
        this.setResizable(false); // Prevent resizing the window
        this.add(label);// add label to frame
        // Set the frame size to match the screen size
        this.setSize(screenWidth, screenHeight); // sets X - dimension, Y - dimension

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        // this.setLayout(null);
        this.setVisible(true);// make frame visible
        this.setIconImage(icon.getImage());// set the image to the frame
        this.getContentPane().setBackground(Color.CYAN);
        this.pack(); // sizes the frame to fit the components
        // Create a new JLabel

    }
}
