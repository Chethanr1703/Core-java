package com.xworkz.penapp.pen.impl;

import com.xworkz.penapp.pen.Pen;

public class InkPenImpl implements Pen {
    @Override
    public void write() {
        System.out.println("using to write");
    }

    @Override
    public void refillInk() {
        System.out.println("using to refill");
    }
}
