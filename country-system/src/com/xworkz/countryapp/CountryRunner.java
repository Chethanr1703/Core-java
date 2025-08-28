package com.xworkz.countryapp;

import com.xworkz.countryapp.country.Country;
import com.xworkz.countryapp.india.India;

public class CountryRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Country country1 = new India();
        country1.typeOfTax();
        System.out.println("main ended");

    }
}
