package com.xworkz.laptop.laptop.impl;

import com.xworkz.laptop.laptop.Laptop;

public class HpLaptop implements Laptop {
    @Override
    public void playGame() {
        System.out.println("play Game using hp laptop");
    }

    @Override
    public void doProject() {
        System.out.println(" do projects using hp laptop");
    }

    @Override
    public void doPPt() {
        System.out.println("do ppt using hp laptop");
    }
}
