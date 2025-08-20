package com.xworkz.galaxyapp;

import com.xworkz.galaxyapp.galaxy.Galaxy;

public class GalaxyRunner {
    public static void main(String[] args) {
        Galaxy gal1 =new Galaxy();
        gal1.setGalaxyId(125);
        gal1.getGalaxyId();
        gal1.setGalaxyName("milkey way");
        gal1.getGalaxyName();
        gal1.setDaimeterOfGalaxy(12561222);
        gal1.getDaimeterOfGalaxy();
        gal1.getGalaxyInfo();

    }
}
