package com.company5;

import java.util.Random;

public class Shop {
    static Residents base[] = new Residents[10];
    public static void main(String[] args) {
        Random random = new Random();
        int r, money;
        String s, name;

        for(int i=0;i<base.length;++i)
        {
            r = random.nextInt(3) + 5;
            s = "";
            name = "";
            for (int j = 0; j < r; ++j)
            {
                s += ((char)(random.nextInt(10) + '0'));
            }
            name += (char)(i + '0');
            money = i == 0 ? 700 : i * 1000;
            base[i] = new Residents(s, name, money);
        }
        for(int i = 0;i < base.length; ++i)
        {
            System.out.println(base[i].getNSL() + "\t" + base[i].getINN() + "\t" + base[i].money);
        }
        System.out.println();

        for (int i = 0; i < base.length; ++i)
        {
            try
            {
                if(checkINN(base[i])) base[i].money-=500;
            }
            catch (ExceptionHandler e)
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\nBase after shopping\n");
        for(int i = 0;i < base.length; ++i)
        {
            System.out.println(base[i].getNSL() + "\t" + base[i].getINN() + "\t" + base[i].money);
        }
    }
    private static boolean checkINN(Residents people) throws ExceptionHandler {
        if(people.getINN().length() == 6) return true;
        else throw new ExceptionHandler(people.getNSL() + " have invalid inn");
    }
}
