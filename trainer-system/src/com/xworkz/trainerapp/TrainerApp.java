package com.xworkz.trainerapp;

import com.xworkz.trainerapp.dev.Dev;
import com.xworkz.trainerapp.trainer.Trainer;

public class TrainerApp {
    public static void main(String[] args) {
    System.out.println("main started");
    Trainer trainer1 = new Dev();
    trainer1.toTeach();
    System.out.println("main ended");

}
}
