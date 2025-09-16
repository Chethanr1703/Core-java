package com.xworkz.laptop;

import com.xworkz.laptop.laptop.Laptop;
import com.xworkz.laptop.laptop.impl.HpLaptop;

public class LaptopRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Laptop laptop = new HpLaptop();
        laptop.playGame();
        laptop.doPPt();
        laptop.doProject();



        System.out.println("main ended");
    }
}
