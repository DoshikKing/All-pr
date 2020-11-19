package com.company4;


import java.util.Scanner;

public class Exep2 {
    public void excepDemo() {
        Scanner myScanner = new Scanner( System.in );

        System.out.print( "Enter int ");

        String intString = myScanner.next();

        int i = Integer.parseInt(intString);
        System.out.println( 2 / i );
    }
}
