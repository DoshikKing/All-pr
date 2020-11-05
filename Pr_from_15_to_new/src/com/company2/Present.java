package com.company2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Present {

    public Image img;
    public int x, y;
    public boolean act;
    private Timer timerUpdate;

    public Present(Image image) {
        timerUpdate = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveDown();
            }
        });
        img = image;
        act = false;
    }

    public void start() {
        timerUpdate.start();
        y = 0;
        x = (int) (Math.random()*700);
        act = true;
    }

    public void moveDown() {
        if (act == true) {
            y += 6;
        }
        if ( (y + img.getHeight(null)) >= 470) {
            timerUpdate.stop();
        }
    }

    public void draw(Graphics gr) {
        if (act == true) {
            gr.drawImage(img, x, y, null);
        }
    }
}
