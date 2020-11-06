package com.company2;

import java.util.Scanner;

public class Pr18 {
    public static int sequence()
    {
        Scanner sc = new Scanner(System.in);
        int first = 0, next = 0, MAX = 0;

        System.out.println("insert");

        while(first != -1)
        {
            System.out.println("First: ");
            first = sc.nextInt();
            if (first == -1)
            {
                break;
            }
            System.out.println("Second: ");
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
        int k;
        Scanner n = new Scanner(System.in);
        System.out.println("Введите номер задания:");
        k = n.nextInt();
        switch (k)
        {
            case 1:
            {
                System.out.println("Insert num");
                Scanner sc = new Scanner(System.in);

                Fact primeFactorization = new Fact();
                primeFactorization.work(sc.nextInt());
            }
            break;
            case 2:
            {
                System.out.println("Insert wrd");
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
            default:
                System.out.println("ERROR");
        }



    }
}
