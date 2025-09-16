package com.xworkz.coffeesystem;

import com.xworkz.coffeesystem.coffee.Coffee;
import com.xworkz.coffeesystem.coffee.impl.CoffeeImpl;

public class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffeeMachine = new CoffeeImpl();
        coffeeMachine.brewCoffee();
        coffeeMachine.refillBeans();
        coffeeMachine.cleanMachine();
    }
}
