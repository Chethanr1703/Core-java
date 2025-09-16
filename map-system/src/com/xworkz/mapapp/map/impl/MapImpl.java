package com.xworkz.mapapp.map.impl;

import com.xworkz.mapapp.map.Map;

public class MapImpl implements Map {
    @Override
    public void showDirections() {
        System.out.println("showDirections");
    }

    @Override
    public void updateLocation() {
        System.out.println("update location");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in map");
    }
}
