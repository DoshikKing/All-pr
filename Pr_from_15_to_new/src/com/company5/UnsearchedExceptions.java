package com.company5;

public class UnsearchedExceptions extends Throwable {
    private String message;

    public UnsearchedExceptions(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}