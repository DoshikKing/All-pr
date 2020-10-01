package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        frtShop newShop = new frtShop();
        newShop.shopShell();

        Person newPerson = new Person();

        newPerson.addNewItemToBasket(newShop.getFromTheShell(5), 5);
        newPerson.addNewItemToBasket(newShop.getFromTheShell(2), 2);

        newPerson.printAllItemsInTheBasket();
    }
}
