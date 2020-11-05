package com.company2;

public class Palim {
    public boolean palindromeCheck(String line){
        return (line.equals(new StringBuilder(line).reverse().toString()));
    }
}
