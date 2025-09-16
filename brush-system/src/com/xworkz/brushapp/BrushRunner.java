package com.xworkz.brushapp;

import com.xworkz.brushapp.brush.Brush;
import com.xworkz.brushapp.brush.impl.ToothBrush;

public class BrushRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Brush brush = new ToothBrush();
        System.out.println("the brush flexible "+ brush.isFlexiable());
        System.out.println(" the price of the brush "+brush.price());

        System.out.println("main ended");
    }
}
