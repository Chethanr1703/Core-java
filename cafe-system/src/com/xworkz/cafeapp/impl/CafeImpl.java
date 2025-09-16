package com.xworkz.cafeapp.impl;

import com.xworkz.cafeapp.cfe.Cafe;

public class CafeImpl implements Cafe {


    @Override
    public void prepareBeverage() { System.out.println("Cafe preparing beverage"); }
    @Override
    public void serveBeverage() { System.out.println("Cafe serving beverage"); }
    @Override
    public void bill() { System.out.println("Cafe billing customer"); }
}
