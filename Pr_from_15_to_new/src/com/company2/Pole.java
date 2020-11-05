package com.company2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Pole extends JPanel {

    private Image shapka;
    private Image fon;
    public int x = 350;
    private int slognost;
    private Present[] presents;
    private Image endGame;
    public Timer timerUpdate, timerDraw;
    public int score = 0;
    public int livesCount = 3;
    public Image elka;

    public Pole(int slogn) {
        slognost = slogn;
        presents = new Present[7];
        try {
            fon = ImageIO.read(new File("C:\\fon.png"));
            shapka = ImageIO.read(new File("C:\\shapka.png"));
            endGame = ImageIO.read(new File("C:\\end_game.png"));
            elka = ImageIO.read(new File("C:\\elka.png"));
            for (int i = 0; i < 7; i++) {
                presents[i] = new Present(ImageIO.read(new File("C:\\p" + i + ".png")));
            }
        } catch (IOException e1) {
        }

        timerUpdate = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStart();
            }
        });
        timerUpdate.start();

        timerDraw = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timerDraw.start();
    }

    public void updateStart() {
        int kol = 0;
        for (int i = 0; i < 7; i++) {
            if (presents[i].act == false) {
                if (kol < slognost) {
                    presents[i].start();
                    break;
                }
            }
            else kol++;
        }
    }

    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.drawImage(fon, 0, 0, null);
        gr.drawImage(shapka, x, 465, null);

        gr.setFont(new Font("TimesRoman", Font.BOLD, 25));
        gr.setColor(Color.BLACK);
        gr.drawString("Счет: " + score, 10, 30);

        gr.drawString("HP: ", 10, 70);
        for (int i = 0; i < livesCount; i++) {
            gr.drawImage(elka, 80+30*i, 30, 60, 60, null);
        }

        for (int i = 0; i < 7; i++) {
            presents[i].draw(gr);
            if (presents[i].act == true) {
                if ( (presents[i].y + presents[i].img.getHeight(null)) >= 470) {
                    if (Math.abs(presents[i].x - x) > 50) {
                        if (livesCount > 1) {
                            presents[i].act = false;
                            livesCount = livesCount - 1;
                        } else {
                            gr.drawImage(endGame, 250, 150, null);
                            timerDraw.stop();
                            timerUpdate.stop();
                            break;
                        }
                    } else {
                        score = score + 5;
                        presents[i].act = false;
                    }
                }
            }
        }
    }
}

