package com.xworkz.countryapp.india;

import com.xworkz.countryapp.country.Country;

public class India extends Country {
    public India() {
        super();
        System.out.println("India cons is invoked");
    }
    @Override
    public void typeOfTax(){
        System.out.println("road tax and GST");
    }
}
