package com.company;

import java.awt.*;

public class MovableRectangle extends Rectangle implements Movable
{
    int length, heigth, speed1, speed2;

    MovablePoint stx = new MovablePoint(0, 0);
    MovablePoint sty = new MovablePoint(0, 0);

    MovableRectangle()
    {
        this.heigth = 0;
        this.length = 0;
    }

    MovableRectangle(int length, int heigth)
    {
        this.length = length;
        this.heigth = heigth;
    }

    MovableRectangle(int length, int heigth, String color, boolean filled)
    {
        this.length = length;
        this.heigth = heigth;
        this.color = color;
        this.filled = filled;
    }
    MovableRectangle(int length, int heigth, String color, boolean filled, MovablePoint sty, MovablePoint stx)
    {
        this.length = length;
        this.heigth = heigth;
        this.color = color;
        this.filled = filled;
        this.stx = stx;
        this.sty = sty;
    }

    public String Movable(int speed1 , int speed2, int s)
    {
        this.speed1 = speed1;
        this.speed2 = speed2;
        this.sty.Movable(speed1,0,0);
        this.stx.Movable(speed2,0,0);
        return "Moved on " + speed1 + " and " + speed2;
    }

    String checkSpeed()
    {
        if (speed1 == speed2)
        {
            return "Speed is the same";
        }
        else{
            return "Not the same";
        }
    }

    void setLength(int length)
    {
        this.length = length;
    }

    void setHeigth(int heigth)
    {
        this.heigth = heigth;
    }

    int getLength()
    {
        return length;
    }

    int getHeigth()
    {
        return heigth;
    }

    @Override
    String _toString()
    {
        return "Color: " + color + "\n" + "Filled: " + filled + "\n" + "Length: " + length + "\n" + "Heigth: " + heigth + "\n";
    }

    @Override
    double getArea()
    {
        return length * heigth;
    }

    @Override
    double Perimetr()
    {
        return (2*length) +(2*heigth);
    }
}
