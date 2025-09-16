package com.xworkz.cutting.cut.impl;

import com.xworkz.cutting.cut.Cutting;

public class KnifeImpl implements Cutting {
    @Override
    public void cut() {
        System.out.println("cutting");
    }

    @Override
    public void sharpen() {
        System.out.println("sharpening");
    }

    @Override
    public void clean() {
        System.out.println("clean");

    }
}
