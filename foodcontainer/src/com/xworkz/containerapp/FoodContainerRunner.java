package com.xworkz.containerapp;

import com.xworkz.containerapp.container.Container;
import com.xworkz.containerapp.container.impl.LanchBoxImpl;

public class FoodContainerRunner {
    public static void main(String[] args) {
        Container container = new LanchBoxImpl();
        container.packFood();
        container.storeFood();
    }
}
