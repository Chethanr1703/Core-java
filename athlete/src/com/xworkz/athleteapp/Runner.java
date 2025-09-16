package com.xworkz.athleteapp;

import com.xworkz.athleteapp.athlete.Athlete;
import com.xworkz.athleteapp.impl.AthleteImpl;

public class Runner {
    public static void main(String[] args) {
        Athlete athlete = new AthleteImpl();
        athlete.practice();
        athlete.compete();
        athlete.recover();
    }

}
