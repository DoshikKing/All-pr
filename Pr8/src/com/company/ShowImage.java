package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowImage extends JFrame
{
    public ShowImage(String path)
    {
        setTitle("Вывод изображения");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);
        setResizable(false);
        setVisible(true);

        Graphics g;
        Image img;

        img = new ImageIcon(path).getImage();

        g = getGraphics();

        g.drawImage(img, 0, 0, null);
    }
}