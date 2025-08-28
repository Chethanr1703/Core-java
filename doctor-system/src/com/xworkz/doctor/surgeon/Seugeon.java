package com.xworkz.doctor.surgeon;

import com.xworkz.doctor.doctor.Doctor;

public class Seugeon extends Doctor {
    public Seugeon(){
        super();
        System.out.println("Seugeon cons is invoked");
    }
    @Override
    public void doAllType(){
        System.out.println("perform all type of operation");
    }
}
