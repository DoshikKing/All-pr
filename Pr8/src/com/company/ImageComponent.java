package com.company;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

class ImageComponent extends JComponent
{
    Image img1 = new ImageIcon("/home/doshikking/JavaProjects/Java/Pr8/src/com/company/1.png").getImage();
    Image img2 = new ImageIcon("/home/doshikking/JavaProjects/Java/Pr8/src/com/company/2.png").getImage();
    Image img3 = new ImageIcon("/home/doshikking/JavaProjects/Java/Pr8/src/com/company/3.png").getImage();
    Image[] mass = new Image[3];

    int i = 0;
    Graphics g;

    public ImageComponent()
    {
        mass[0] = img1;
        mass[1] = img2;
        mass[2] = img3;
    }

    public void paintComponent(Graphics g)
    {
        this.g = g;
        g.drawImage(this.mass[this.i], this.getX(), this.getY(), null);
    }

    public void nextImg()
    {
        //this.g.drawImage(this.mass[this.i], 0, 0, null);
        this.i++;
        if(this.i >= this.mass.length)
        {
            this.i = 0;
        }
        this.repaint();
    }
}
