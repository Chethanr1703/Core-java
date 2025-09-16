package com.xworkz.lightapp;

import com.xworkz.lightapp.switchs.Switches;
import com.xworkz.lightapp.switchs.impl.*;

public class LightRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Switches switches = new TubeLightImpl();
        switches.on();
        switches.off();

        Switches switches1= new CflBulbImpl();
        switches1.on();
        switches1.off();

        Switches switches2 = new LEDImpl();
        switches2.on();
        switches2.off();

        Switches switches3 = new DiscoImpl();
        switches3.on();
        switches3.off();

        Switches switches4= new HalogenImpl();
        switches4.on();
        switches4.off();

        Switches switches5 = new SmartBulbImpl();
        switches5.on();
        switches5.off();

        System.out.println("main ended");
    }
}
