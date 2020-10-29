package com.company;


import java.util.Scanner;

public class Main {
    static MyCollection myCollection = new MyCollection();

    static void output(){
        for (int i = 0; i < myCollection.getSize(); i++)
            System.out.print(myCollection.searchByInd(i) + " ");
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        for (int i = 0; i < 5; i++)
            myCollection.add((int)(Math.random() * 100));
        output();

        System.out.println("Введите индекс удаляемого элемента: ");
        myCollection.delete(sc.nextInt());
        output();

        System.out.println("Введите значение элемента искомого индекса: ");
        result = myCollection.searchByItem(sc.nextInt());
        if (result != Integer.MIN_VALUE)
            System.out.println(result);
        else
            System.out.println("Нет такого");

        System.out.println("Введите индекс искомого элемента: ");
        result = myCollection.searchByInd(sc.nextInt());
        if (result != Integer.MIN_VALUE)
            System.out.println(result);
        else
            System.out.println("Нет такого");

        result = myCollection.maxItem();
        if (result != Integer.MIN_VALUE)
            System.out.println("Значение максимального элемента: " + result);
        else
            System.out.println("Нет максимального");

        result = myCollection.minItem();
        if (result != Integer.MAX_VALUE)
            System.out.println("Значение минимального элемента: " + result);
        else
            System.out.println("Нет минимального");

        System.out.println("Среднее арифметическое значение: " + myCollection.averageNumber());
    }
}