package com.xworkz.coffeesystem.coffee.impl;

import com.xworkz.coffeesystem.coffee.Coffee;

public class CoffeeImpl implements Coffee {
    @Override
    public void brewCoffee() {
        System.out.println("Coffee brewed successfully");
    }

    @Override
    public void cleanMachine() {
        System.out.println("Coffee machine cleaned");
    }

    @Override
    public void refillBeans() {
        System.out.println("Coffee beans refilled");
    }
}
