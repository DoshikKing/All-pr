package com.company6;

import java.util.Arrays;

public class Tester3 {
    public static void main(String[] args) {
        String[] strings = {"it", "lives", "it", "breathes"};
        Integer[] integers = {1, 2, 3, 4};

        MyArrayMidified<String> stringMyArray = new MyArrayMidified<>(strings);
        MyArrayMidified<Integer> integerMyArray = new MyArrayMidified<>(integers);

        System.out.println(Arrays.toString(stringMyArray.getArray()));
        System.out.println(Arrays.toString(integerMyArray.getArray()));

        int ind = 1;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringMyArray.at(ind));
        }
        catch (MyArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        ind = -1;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringMyArray.at(ind));
        }
        catch (MyArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        ind = 10;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringMyArray.at(ind));
        }
        catch (MyArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
