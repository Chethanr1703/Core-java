package com.xworkz.laptopapp;

import com.xworkz.laptopapp.hp.Hp;
import com.xworkz.laptopapp.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Laptop laptopBrand = new Hp();
        laptopBrand.toWork();
        System.out.println("main ended");

    }
}
