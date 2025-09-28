package com.xworkz.amazonapp.exception;

public class ProductPriceNotFoundException extends RuntimeException {
  public ProductPriceNotFoundException(String message) {
    super(message);
  }
}
