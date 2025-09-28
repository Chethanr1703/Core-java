package com.xworkz.libraryapp.exception;

public class PriceNotUpdatedException extends RuntimeException{
    public PriceNotUpdatedException(String errorMessage){
        super(errorMessage);
    }
}
