package com.example;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelFrame extends JFrame{
    public PanelFrame(){
        // Add the panel to the frame
        // Set the frame size to match the screen size
        JLabel label = new JLabel();
        label.setText("Hello, World!");

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.add(label);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
        this.setLayout(null);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setTitle("JPanel Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
