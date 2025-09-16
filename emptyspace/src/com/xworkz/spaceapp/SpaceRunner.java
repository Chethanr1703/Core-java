package com.xworkz.spaceapp;

import com.xworkz.spaceapp.mall.Mall;
import com.xworkz.spaceapp.mall.impl.ShoppingMallImpl;

public class SpaceRunner {
    public static void main(String[] args) {
        Mall mall = new ShoppingMallImpl();
        mall.openStore();
        mall.closeStore();
        mall.organizeEvents();
    }
}
