package com.company4;

public class Exep2execute {
    public static void main(String[] args) {
        Exep2 exception2 = new Exep2();
        try
        {
            exception2.excepDemo();
        }
        catch (Exception e)
        {
            System.out.println("Infinity...");
        }
        finally
        {
            System.out.println("End of program...");
        }
    }
}
