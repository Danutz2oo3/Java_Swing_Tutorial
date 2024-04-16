package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonFrame extends JFrame{
    JButton button;

    public ButtonFrame() {

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.setText("Click Me");
        button.addActionListener(e -> {
            System.out.println("Button Clicked");
        });
        button.setFocusable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    
}
