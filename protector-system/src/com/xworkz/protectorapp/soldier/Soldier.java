package com.xworkz.protectorapp.soldier;

import com.xworkz.protectorapp.protector.Protector;

public class Soldier extends Protector {
    public Soldier(){
        super();
        System.out.println("Soldier cons is invoked");
    }
    @Override
    public void toSave(){
        System.out.println("to save the life of the people of their country");
    }
}
