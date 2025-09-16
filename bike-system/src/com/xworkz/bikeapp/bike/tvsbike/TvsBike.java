package com.xworkz.bikeapp.bike.tvsbike;

import com.xworkz.bikeapp.bike.Bike;

public class TvsBike implements Bike {
    @Override
    public void start() {
        System.out.println("the tvs bike is started");
    }

    @Override
    public void stop() {
        System.out.println("the tvs bike is stoped");
    }
}
