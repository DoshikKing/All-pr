package com.company2;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Okno extends JFrame {

    private Pole gameField;

    private class MyKey implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == 27) {
                System.exit(0);
            } else if (key == 37) {
                if (gameField.x - 30 > -50) {
                    gameField.x -= 30;
                } else {
                    gameField.x = 750;
                }
            } else if (key == 39) {
                if (gameField.x + 30 < 750) {
                    gameField.x += 30;
                } else {
                    gameField.x = -50;
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

    }

    public Okno(int slogn) {
        addKeyListener(new MyKey());
        setFocusable(true);
        setBounds(0, 0, 800, 600);
        setTitle("Игра");
        gameField = new Pole(slogn);
        Container cont = getContentPane();
        cont.add(gameField);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
