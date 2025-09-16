package com.xworkz.athleteapp.impl;

import com.xworkz.athleteapp.athlete.Athlete;

public class AthleteImpl implements Athlete {
    @Override
    public void practice() { System.out.println("Athlete practicing hard"); }
    @Override
    public void compete() { System.out.println("Athlete competing in event"); }
    @Override
    public void recover() { System.out.println("Athlete recovering after performance"); }

}
