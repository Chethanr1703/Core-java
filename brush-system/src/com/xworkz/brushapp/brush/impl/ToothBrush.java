package com.xworkz.brushapp.brush.impl;

import com.xworkz.brushapp.brush.Brush;

public class ToothBrush implements Brush {

    @Override
    public void toClean() {
        System.out.println(" to clean the teeth");
    }

    @Override
    public boolean isFlexiable() {
        return false;
    }

    @Override
    public double price() {
        return 0;
    }
}
