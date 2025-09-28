package com.xworkz.amazonapp.exception;

public class NoProductAddedException extends RuntimeException {
    public NoProductAddedException(String errorMessage) {
        super(errorMessage);
    }
}
