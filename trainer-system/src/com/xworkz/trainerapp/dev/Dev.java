package com.xworkz.trainerapp.dev;

import com.xworkz.trainerapp.trainer.Trainer;

public class Dev extends Trainer {
    public Dev(){
        super();
        System.out.println("Dev cons is invoked");

    }
    @Override
    public void toTeach(){
        System.out.println("to teach the technical concept ");
    }
}
