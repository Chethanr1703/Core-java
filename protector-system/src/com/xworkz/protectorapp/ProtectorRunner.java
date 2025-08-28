package com.xworkz.protectorapp;

import com.xworkz.protectorapp.protector.Protector;
import com.xworkz.protectorapp.soldier.Soldier;

public class ProtectorRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Protector protector1 = new Soldier();
        protector1.toSave();
        System.out.println("main ended");

    }
}
