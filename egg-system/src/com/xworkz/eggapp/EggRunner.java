package com.xworkz.eggapp;

import com.xworkz.eggapp.egg.Egg;
import com.xworkz.eggapp.egg.impl.EggImplementation;

public class EggRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Egg egg = new EggImplementation();
        egg.provideProtien();
        egg.fry();


        System.out.println("main ended");
    }
}
