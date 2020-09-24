package com.company;

public class SpeedTest
{
    void moveTest(MovablePoint a1,MovablePoint a2)
    {
        a1.setPosition(10);
        a2.setPosition(-40);
        if((a1.getPosition()-a1.getStartPosition())==(a2.getPosition()-a2.getStartPosition()))
        {
            System.out.println("Равны");
        }
        else
        {
            System.out.println("Не равны");
        }
    }
}
