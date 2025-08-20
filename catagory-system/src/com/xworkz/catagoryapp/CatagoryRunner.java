package com.xworkz.catagoryapp;

import com.xworkz.catagoryapp.catagory.Catagory;

public class CatagoryRunner {
    public static void main(String[] args) {
        Catagory catagory1 =new Catagory();

        catagory1.setCatagoryId(151);
     int id=   catagory1.getCatagoryId();

        catagory1.setcName("electronics");
     String name=   catagory1.getcName();
        catagory1.setNoOfproduct(25);
      int noOfProducts=  catagory1.getNoOfproduct();

            System.out.println("fetching Catagory info ----");
            System.out.println("the id of the Catagory is :"+id);
            System.out.println("the name of the Catagory : "+name);
            System.out.println("the noOfproduct in the Catagory :"+noOfProducts);
        }

}
