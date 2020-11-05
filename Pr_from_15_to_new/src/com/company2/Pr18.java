package com.company2;

import java.util.Scanner;

public class Pr18 {
    public static int sequence()
    {
        Scanner sc = new Scanner(System.in);
        int first = 0, next = 0, MAX = 0;

        while(first != -1)
        {
            if (first == -1)
            {
                break;
            }
            first = sc.nextInt();
            next = sc.nextInt();
            if(first > next)
            {
                MAX = first;
            }
            else{
                MAX = next;
            }
        }
        return MAX;
    }
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        switch (n.nextInt())
        {
            case 1:
            {
                Scanner sc = new Scanner(System.in);

                Fact primeFactorization = new Fact();
                primeFactorization.work(sc.nextInt());
            }
            break;
            case 2:
            {
                Scanner sc = new Scanner(System.in);

                Palim palindrome = new Palim();
                if (palindrome.palindromeCheck(sc.nextLine()))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            break;
            case 3:
            {
                System.out.println(sequence());
            }
            break;
        }



    }
}
