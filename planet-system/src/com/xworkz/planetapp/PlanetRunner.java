package com.xworkz.planetapp;

import com.xworkz.planetapp.planet.Planet;

public class PlanetRunner {
    public static void main(String[] args) {
        Planet planet1=new Planet();
        planet1.setPlanetId(3);
        planet1.getPlanetId();
        planet1.setPlanetname("earth");
        planet1.getPlanetname();
        planet1.setLife(true);
        planet1.getIsLife();
        planet1.getPlanetInfo();
    }
}
