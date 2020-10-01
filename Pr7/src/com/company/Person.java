package com.company;

public class Person {

    String[] basket;

    public Person()
    {
        String[] newOne = new String[10];

        basket = newOne;

        for (int i = 0; i < 10; i++)
        {
            basket[i] = "";
        }
    }

    public String addNewItemToBasket(String name, int index)
    {
        basket[index] = name;
        return "good";
    }

    public void printAllItemsInTheBasket()
    {
        System.out.println("items in the basket");
        for (int i = 0; i < basket.length; i++)
        {
            System.out.println(basket[i]);
        }
    }
}
