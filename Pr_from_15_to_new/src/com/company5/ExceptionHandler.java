package com.company5;

public class ExceptionHandler extends Throwable {
    private String message;

    public ExceptionHandler(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
