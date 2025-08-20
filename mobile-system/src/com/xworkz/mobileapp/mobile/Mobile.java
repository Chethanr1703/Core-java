package com.xworkz.mobileapp.mobile;

public class Mobile {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getMovieInfo(){
        System.out.println("fetching mobile info ----");
        System.out.println("the id of the mobile is :"+id);
        System.out.println("the name of the brandName : "+brandName);
        System.out.println("the noOfCountry in the price :"+price);


    }
}
