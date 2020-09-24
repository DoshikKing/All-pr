package com.company;

public class MovablePoint extends MovableRectangle implements Movable
{
    private int position=getStartPosition();

    MovablePoint(String color, boolean filled, int speed, int direction, int startX, int startY)
    {
        super(color, filled, speed, direction, startX, startY);
        position=startX;
    }

    int getPosition()
    {
        return position;
    }

    void setPosition(int speed)
    {
        position+=speed;
    }
}
