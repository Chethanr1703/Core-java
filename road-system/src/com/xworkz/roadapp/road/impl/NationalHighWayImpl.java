package com.xworkz.roadapp.road.impl;

import com.xworkz.roadapp.road.Road;

public class NationalHighWayImpl implements Road {
    @Override
    public void allowTraffic() {
        System.out.println("allowing the traffic");
    }

    @Override
    public void repair() {
        System.out.println("doing the repair");
    }

    @Override
    public void block() {
        System.out.println("donot do block");
    }
}
