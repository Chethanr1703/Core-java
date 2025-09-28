package com.xworkz.theaterapp.exception;

public class MovieNameNotFoundException extends RuntimeException {
    public MovieNameNotFoundException(String message) {
        super(message);
    }
}
