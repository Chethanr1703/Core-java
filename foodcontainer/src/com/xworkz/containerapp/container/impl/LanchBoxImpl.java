package com.xworkz.containerapp.container.impl;

import com.xworkz.containerapp.container.Container;

public class LanchBoxImpl implements Container {

    @Override
    public void packFood() {
        System.out.println(" to pack the food ");
    }

    @Override
    public void storeFood() {
        System.out.println(" to store the food");
    }
}
