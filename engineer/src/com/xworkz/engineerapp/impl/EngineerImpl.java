package com.xworkz.engineerapp.impl;

import com.xworkz.engineerapp.engineer.Engineer;

public class EngineerImpl implements Engineer {
    @Override
    public void identifyProblem() {
        System.out.println("Engineer identifying problem");
    }

    @Override
    public void designSolution() {
        System.out.println("Engineer designing solution");
    }

    @Override
    public void implementSolution() {
        System.out.println("Engineer implementing solution");
    }
}
