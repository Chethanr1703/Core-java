package com.xworkz.theaterapp.exception;

public class MoviesNotFoundException extends RuntimeException {
    public MoviesNotFoundException(String message) {
        super(message);
    }
}
