package com.xworkz.zooapp;

import com.xworkz.zooapp.AnimalCare.AnimalCare;
import com.xworkz.zooapp.AnimalCare.impl.MysoreZoo;

public class ZooRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        AnimalCare animalCare = new MysoreZoo();
        animalCare.feedingAnimal();
        animalCare.caringAnimal();
        animalCare.provideShelter();


        System.out.println("main ended");
    }
}
