package com.xworkz.spaceapp.mall.impl;

import com.xworkz.spaceapp.mall.Mall;

public class ShoppingMallImpl implements Mall {
    @Override
    public void openStore() {
        System.out.println("openning a store");
    }

    @Override
    public void closeStore() {
        System.out.println("closing a store");
    }

    @Override
    public void organizeEvents() {
        System.out.println(" orgainzing events");
    }
}
