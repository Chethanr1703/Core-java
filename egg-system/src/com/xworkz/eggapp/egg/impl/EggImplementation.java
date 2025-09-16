package com.xworkz.eggapp.egg.impl;

import com.xworkz.eggapp.egg.Egg;

public class EggImplementation implements Egg {
    @Override
    public void provideProtien() {
        System.out.println("providing 6 g of protien");
    }

    @Override
    public void fry() {
        System.out.println(" egg fry");
    }
}
