package com.company2;

public class Fact {
    public void work(int number) {
        for (int i = 2; i <= Math.sqrt(number);){
            if(number % i ==0){
                System.out.print(i);
                number /= i;
                if(number > 1)
                    System.out.print(' ');
            }
            else
                i++;
        }
        if(number > 1)
            System.out.print(number);
    }
}
