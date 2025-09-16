package com.xworkz.engineerapp;

import com.xworkz.engineerapp.engineer.Engineer;
import com.xworkz.engineerapp.impl.EngineerImpl;

public class Runner {

    public static void main(String[] args) {
        Engineer engineer = new EngineerImpl();
        engineer.identifyProblem();
        engineer.designSolution();
        engineer.implementSolution();
    }
}
