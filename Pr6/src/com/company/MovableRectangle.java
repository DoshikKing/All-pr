package com.company;

public class MovableRectangle extends Rectangle implements Movable
{
    private int speed,direction,startX,startY;
    MovableRectangle(String color, boolean filled,int speed,int direction,int stX,int stY)
    {
        this.color = color;
        this.filled = filled;
        this.speed=speed;
        this.direction=direction;
        this.startX=stX;
        this.startY=stY;
    }

    int getSpeed()
    {
        return speed;
    }

    int getDirection()
    {
        return direction;
    }

    int getStartPosition()
    {
        return startX;
    }

    int getMovable()
    {
        return getMovableStart(speed,direction);
    }
}
