package com.xworkz.bottle;

import com.xworkz.bottle.bottle.Bottle;
import com.xworkz.bottle.bottle.impl.PlasticBottle;

public class BottleRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Bottle bottle = new PlasticBottle();
        bottle.holdLiquid();
        bottle.seal();
        bottle.clean();


        System.out.println("main ended");
    }
}
