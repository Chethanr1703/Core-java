package com.xworkz.kettleapp.kettle.impl;

import com.xworkz.kettleapp.kettle.Kettle;

public class KettleImpl implements Kettle {
    @Override
    public void boilWater() {
        System.out.println("Water is boiling");
    }

    @Override
    public void stopBoiling() {
        System.out.println("Kettle stopped boiling");
    }
}
