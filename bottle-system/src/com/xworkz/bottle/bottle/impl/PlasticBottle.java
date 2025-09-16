package com.xworkz.bottle.bottle.impl;

import com.xworkz.bottle.bottle.Bottle;

public class PlasticBottle implements Bottle {
    @Override
    public void holdLiquid() {
        System.out.println("holding liquid");
    }

    @Override
    public void seal() {
        System.out.println(" sealed pastic bottle");
    }

    @Override
    public void clean() {
        System.out.println( "claen the plastic bottle");
    }
}
