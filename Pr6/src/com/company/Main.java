package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        MovablePoint a1=new MovablePoint(0,0);
        MovablePoint a2=new MovablePoint(0,0);
        MovableRectangle obj2=new MovableRectangle(20,12,"red",true, a1, a2);

        System.out.println(obj2.Movable(15, 15, 0));
        System.out.println(obj2.checkSpeed());
    }
}
