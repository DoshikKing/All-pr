package com.company;

import javax.swing.*;
import java.awt.*;

public class Square extends JComponent
{
    private int x, y, width, height;

    public Square(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        Color color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));

        g2d.setPaint(color);
        g2d.fillRect(x, y, width, height);
    }
}