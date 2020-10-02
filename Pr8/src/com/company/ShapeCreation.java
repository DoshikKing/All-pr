package com.company;

import javax.swing.*;

public class ShapeCreation extends JFrame
{
    public ShapeCreation()
    {
        int width = 500;
        int height = 400;
        int cols = 5;
        int rows = 4;

        setTitle("Drawing shapes...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Circle circle;
        Square square;

        setSize(width + 500, height + 1000);

        for (int i = 0; i < cols; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                switch((int)(Math.random()*2))
                {
                    case 0:
                        circle = new Circle(2*i*width/cols,2*j*height/rows, width/cols - 4,height/rows - 4);
                        add(circle);
                        break;
                    case 1:
                        square = new Square(2*i*width/cols,2*j*height/rows, width/cols - 4,height/rows - 4);
                        add(square);
                        break;
                }
                setVisible(true);
            }
        }
        setResizable(false);
    }
}
