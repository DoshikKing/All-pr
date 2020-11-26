package com.company6;


public class MyArrayIndexOutOfBoundsException extends Throwable{
    private String message;
    public MyArrayIndexOutOfBoundsException(int ind){
        message = "Индекс " + ind + " вне диапазона";
    }

    public String getMessage() {
        return message;
    }
}
