package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int k, d;

        Scanner sc = new Scanner(System.in);

        k = sc.nextInt();
        d = sc.nextInt();

        int min = (int)Math.pow(10, k - 1);
        int max = (int)Math.pow(10, k);

        int cnt = 0, sum, num;

        for (int i = min; i < max; i++) {

            sum = 0;
            num = i;

            while (num != 0){
                sum += num%10;
                num /= 10;
            }
            if (sum == d)
                cnt++;
        }
        System.out.println(cnt);
    }
}
