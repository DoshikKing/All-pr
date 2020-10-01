package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class frtShop
{
    Shell shl1 = new Shell("12","Shell_Fell", "Shell", "4");
    Shell shl2 = new Shell("13","Fukuoki", "Shell", "12");
    Shell shl3 = new Shell("14","Never_mind", "Shell", "10");
    Shell shl4 = new Shell("15","Pliopa", "Shell", "70");
    Dish dsh1 = new Dish("x0x12","Fells", "Dish", "5");
    Dish dsh2 = new Dish("x0x13","Kells", "Dish", "7");

    List<String> shopShell = new ArrayList<String>();

    public frtShop()
    {
        /*
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        switch(x)
        {
            case 1:
                shl1.displayInfo();
                shl2.displayInfo();
                shl3.displayInfo();
                shl4.displayInfo();
                dsh1.displayInfo();
                dsh2.displayInfo();
                return;
            case 2:
                shl1.getID();
                shl2.getID();
                shl3.getID();
                shl4.getID();
                dsh1.getID();
                dsh2.getID();
                return;
            case 3:
                shl1.getName();
                shl2.getName();
                shl3.getName();
                shl4.getName();
                dsh1.getName();
                dsh2.getName();
        }
         */
    }

    public void shopShell()
    {
        shopShell.add(shl1.getName());
        shopShell.add(shl2.getName());
        shopShell.add(shl3.getName());
        shopShell.add(shl4.getName());
        shopShell.add(dsh1.getName());
        shopShell.add(dsh2.getName());
    }

    public String getFromTheShell(int index)
    {
        String element = (String) shopShell.get(index);

        return element;
    }

}