package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Graphics;

public class Img extends JFrame
{
    ImageComponent component = new ImageComponent();

    public class ImgActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            component.nextImg();
                 /*
                 for(int i = 0; i < 6; i++)
                 {
                     try
                     {
                         Thread.sleep(1000);
                     }
                     catch(InterruptedException ex)
                     {}
                     finally
                     {

                     }
                 }
                  */
        }
    }

    public Img()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        //setBounds(0,0,500,500);
        //setLayout(new FlowLayout());
        Timer tm = new Timer(1000, new ImgActionListener());
        tm.start();
        JButton btn1 = new JButton();
        btn1.setSize(100,100);
        //btn1.setBounds(600,600,100,100);
        component.setSize(500, 500);
        component.setVisible(true);

        add(component);
        //add(btn1);
        //btn1.addActionListener(new ImgActionListener());
        // this.repaint();
    }
}