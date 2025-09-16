package com.xworkz.mapapp;

import com.xworkz.mapapp.map.Map;
import com.xworkz.mapapp.map.impl.MapImpl;

public class MapRunner {
    public static void main(String[] args) {
        Map map = new MapImpl();
        map.showDirections();
        map.updateLocation();
        map.zoomIn();
    }
}
