package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game extends JFrame {

    Game()
    {
        int MAIN_NUM = (int)(Math.random() * 20);
        System.out.println(MAIN_NUM);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton button = new JButton("Guess!");
        JTextField textField = new JTextField(5);

        this.add(panel);
        panel.add(button);
        panel.add(textField);

        this.setResizable(false);
        this.setSize(700,70);
        this.setVisible(true);
        panel.setSize(700,70);
        panel.setVisible(true);
        button.setHorizontalAlignment(JButton.RIGHT);
        button.setSize(200,200);
        button.setVisible(true);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setSize(100,100);
        textField.setVisible(true);

        button.addActionListener(new ActionListener() {

            int count = 0;
            public void actionPerformed(ActionEvent actionEvent) {

                if (count == 2){
                    JOptionPane.showMessageDialog(Game.this,"Out of attempts!");
                    System.exit(0);
                }
                int num = Integer.parseInt(textField.getText());




                if(num == MAIN_NUM) {
                    JOptionPane.showMessageDialog(Game.this,"Right! You win!");
                    System.exit(0);
                }
                else {
                    if (num < MAIN_NUM)
                    {
                        JOptionPane.showMessageDialog(Game.this,"bigger then input");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(Game.this,"less then input");
                    }

                }
                count++;

            }
        });
    }

}
