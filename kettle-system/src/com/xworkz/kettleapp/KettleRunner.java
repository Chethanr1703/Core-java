package com.xworkz.kettleapp;

import com.xworkz.kettleapp.kettle.Kettle;
import com.xworkz.kettleapp.kettle.impl.KettleImpl;

public class KettleRunner {
    public static void main(String[] args) {
        Kettle kettle = new KettleImpl();
        kettle.boilWater();
        kettle.stopBoiling();
    }
}
