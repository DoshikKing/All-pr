package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        MovableRectangle obj2=new MovableRectangle("ss",true,2,-1, 0, 0);
        SpeedTest a=new SpeedTest();
        MovablePoint a1=new MovablePoint("red",true,12,-1,0,0);
        MovablePoint a2=new MovablePoint("blue",false,16,1,-100,0);
        a.moveTest(a1,a2);
    }
}
