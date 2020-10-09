package com.company3;

import java.util.Scanner;

public class Main3 {
    public static void seq(int num){
        if (num >= 10)
            seq(num / 10);
        System.out.print(num % 10 + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        seq(N);
    }
}
