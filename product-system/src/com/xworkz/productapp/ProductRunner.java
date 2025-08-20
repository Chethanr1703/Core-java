package com.xworkz.productapp;

import com.xworkz.productapp.product.Product;

public class ProductRunner {
    public static void main(String[] args) {


        Product product1 = new Product();
        product1.setProductId(1023);
        product1.getProductId();
        product1.setName("fan");
        product1.getName();
        product1.setPrice(1560.50);
        product1.getPrice();

        product1.getProductInfo();
    }
}