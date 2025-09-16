package com.xworkz.penapp;

import com.xworkz.penapp.pen.Pen;
import com.xworkz.penapp.pen.impl.InkPenImpl;

public class PenRunner {
    public static void main(String[] args) {

        Pen pen = new InkPenImpl();
        pen.write();
        pen.refillInk();

    }
}
