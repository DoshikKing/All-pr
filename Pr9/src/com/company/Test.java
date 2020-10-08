package com.company;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Test extends JFrame {

    public Test(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton button = new JButton("PUSH");
        ActionListener actionListener = new TestActionListener();
        button.addActionListener(actionListener);
        panel.add(button);
        panel.setVisible(true);
        panel.setSize(1000, 1000);
        this.add(panel);
        button.setVisible(true);
        button.setSize(100,100);
    }

}
