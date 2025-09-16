package com.xworkz.roadapp;

import com.xworkz.roadapp.road.Road;
import com.xworkz.roadapp.road.impl.NationalHighWayImpl;

public class RoadRunner {
    public static void main(String[] args) {
        Road road = new NationalHighWayImpl();
        road.allowTraffic();
        road.block();
        road.repair();
    }
}
