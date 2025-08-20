package com.xworkz.cityapp;

import com.xworkz.cityapp.city.City;

public class CityRunner {
    public static void main(String[] args) {
        City c1 = new City();
       c1.setId(1);
        int id =c1.getId();
      c1.setCityName("bengaluru");
        String cityName=  c1.getCityName();
       c1.setPincode(560001);
        int pincode= c1.getPincode();


            System.out.println("the id of the city is :"+id);
            System.out.println("the name of the city " +cityName);
            System.out.println("the pincode of the city is "+pincode);




    }
}
