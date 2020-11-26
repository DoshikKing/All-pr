package com.company6;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new Transfer().fromArrayToList(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(integerArrayList);

        ArrayList<String> stringArrayList = new Transfer().fromArrayToList(new String[]{"it", "lives", "it", "breathes"});
        System.out.println(stringArrayList);
    }
}
