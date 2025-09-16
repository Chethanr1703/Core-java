package com.xworkz.cafeapp;

import com.xworkz.cafeapp.cfe.Cafe;
import com.xworkz.cafeapp.impl.CafeImpl;

public class CafeRunner {

    public static void main(String[] args) {
        Cafe cafe = new CafeImpl();
        cafe.prepareBeverage();
        cafe.serveBeverage();
        cafe.bill();
    }
}
