package com.xworkz.productapp.product;

public class Product {
    private int productId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getProductInfo(){
        System.out.println("fetching Product info ----");
        System.out.println("the id of the Product is :"+productId);
        System.out.println("the name of the Product : "+name);
        System.out.println("the price in the Product :"+price);

    }
}
