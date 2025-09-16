package com.xworkz.chefapp.impl;

import com.xworkz.chefapp.chef.Chef;

public class ChefImpl implements Chef {
    @Override
    public void selectingIngredients() {
        System.out.println("selectingIngredients");
    }

    @Override
    public void cook() {
        System.out.println("cooking food");
    }

    @Override
    public void cutting() {
        System.out.println("cutting vegetables");
    }
}
