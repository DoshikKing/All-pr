package com.company2;

import java.util.Scanner;

public class Main {
    public static int seq(int a, int b) {

        if (a > b + 1)
            return 0;
        if (a == 0 || b == 0)
            return 1;

        return seq(a, b - 1) + seq(a - 1, b - 1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(seq(sc.nextInt(), sc.nextInt()));
    }
}
