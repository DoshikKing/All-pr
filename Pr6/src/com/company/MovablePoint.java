package com.company;

public class MovablePoint implements Movable
{
    private int stX, stY;

    MovablePoint(int stX, int stY)
    {
        this.stX = stX;
        this.stY = stY;
    }

    public String Movable(int speed, int i, int o)
    {
        this.stX += speed;
        this.stY += speed;
        return "X " + stX + "Y " + stY;
    }
}
