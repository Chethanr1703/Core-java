package com.xworkz.shoesapp;

import com.xworkz.shoesapp.shoe.Shoe;
import com.xworkz.shoesapp.shoe.impl.BataShoeImpl;

public class ShoesRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Shoe shoe =new BataShoeImpl();
        shoe.isComfortable();
        shoe.isFormal();
        shoe.isRunning();



        System.out.println("main ended");
    }
}
