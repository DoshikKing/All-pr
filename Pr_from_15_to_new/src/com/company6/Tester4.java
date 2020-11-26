package com.company6;


import java.util.ArrayList;
import java.util.Scanner;

public class Tester4 {
    public static void main(String[] args) throws NoSuchFileException {
        String path = "Labs\\src";
        ArrayList<String> files = new MyDirectory(path).getDirectoryContent();
        System.out.println(path + ":");
        for (int i = 0; i < 5 && i < files.size(); i++)
            System.out.println(files.get(i));

        path = "Labs\\src\\Lab23\\Ex4";
        files = new MyDirectory(path).getDirectoryContent();
        System.out.println(path + ":");
        for (int i = 0; i < 5 && i < files.size(); i++)
            System.out.println(files.get(i));
    }
}
