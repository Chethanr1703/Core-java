package com.xworkz.countryapp;

import com.xworkz.countryapp.country.Country;

public class CountryRunner {
    public static void main(String[] args) {
        Country country1= new Country();
        country1.setId(101);
        country1.getId();
        country1.setCountryname("India");
        country1.getCountryname();
        country1.setNoOfCountry(196);
        country1.getNoOfCountry();
        country1.getCountryInfo();
    }
}
