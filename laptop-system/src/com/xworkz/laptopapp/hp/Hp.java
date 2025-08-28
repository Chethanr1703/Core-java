package com.xworkz.laptopapp.hp;

import com.xworkz.laptopapp.laptop.Laptop;

public class Hp extends Laptop {
    public Hp(){
        super();
        System.out.println("hp cons is invoked");
    }
    @Override
    public void toWork(){
        System.out.println("to work easily and efficient");
    }
}
