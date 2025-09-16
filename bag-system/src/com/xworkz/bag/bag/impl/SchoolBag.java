package com.xworkz.bag.bag.impl;

import com.xworkz.bag.bag.Bag;

public class SchoolBag implements Bag {
    @Override
    public void toCarryBooks() {
        System.out.println("helps to carry books");
    }

    @Override
    public void toCarryProducts() {
        System.out.println("helps to carry stationary products");
    }

    @Override
    public void helpToHandle() {
        System.out.println("helps to handle set of thing in one ");
    }
}
