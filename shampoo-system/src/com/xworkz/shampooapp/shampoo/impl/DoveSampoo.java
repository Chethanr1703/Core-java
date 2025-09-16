package com.xworkz.shampooapp.shampoo.impl;

import com.xworkz.shampooapp.shampoo.Shampoo;

public class DoveSampoo implements Shampoo{
    @Override
    public void apply() {
        System.out.println("apply");
    }

    @Override
    public void massage() {
        System.out.println("massage");
    }

    @Override
    public void rinse() {
        System.out.println("rinse");
    }
}
