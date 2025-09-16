package com.xworkz.zooapp.AnimalCare.impl;

import com.xworkz.zooapp.AnimalCare.AnimalCare;

public class MysoreZoo implements AnimalCare {
    @Override
    public void feedingAnimal() {
        System.out.println("Feeding the zoo animal");
    }

    @Override
    public void caringAnimal() {
        System.out.println("caring the zoo animal");
    }

    @Override
    public void provideShelter() {
        System.out.println("provideShelter for the zoo animal");
    }
}
