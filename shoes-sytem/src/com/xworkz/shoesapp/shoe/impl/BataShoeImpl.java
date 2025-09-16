package com.xworkz.shoesapp.shoe.impl;

import com.xworkz.shoesapp.shoe.Shoe;

public class BataShoeImpl implements Shoe {
    @Override
    public boolean isComfortable() {
        System.out.println("is comfortable "+true);
        return true;
    }

    @Override
    public boolean isRunning() {
        System.out.println("is running "+true);
        return true;
    }

    @Override
    public boolean isFormal() {
        System.out.println("is formal "+false);
        return false;
    }
}
