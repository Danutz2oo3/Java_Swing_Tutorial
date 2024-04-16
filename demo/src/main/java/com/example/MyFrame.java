package com.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
        // Get the screen size
        public MyFrame(){

            ImageIcon icon = new ImageIcon("demo/src/main/resources/64211552.jpg");//create an ImageIcon
            JLabel label = new JLabel();
            label.setText("Hello, World!");
            label.setIcon(icon);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            label.setForeground(new Color(Color.MAGENTA.getRGB()));
            label.setFont(new Font("MV Boli", Font.ITALIC, 40));
            label.setIconTextGap(10);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = (int) screenSize.getWidth();
            int screenHeight = (int) screenSize.getHeight();
            
            this.setTitle("JFrame Example");
            this.setResizable(false); // Prevent resizing the window
            this.add(label);
            // Set the frame size to match the screen size
            this.setSize(screenWidth, screenHeight); // sets X - dimension, Y - dimension

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            
            
            this.setIconImage(icon.getImage());//set the image to the frame
            this.getContentPane().setBackground(Color.CYAN);

            // Create a new JLabel
            
        }
}
