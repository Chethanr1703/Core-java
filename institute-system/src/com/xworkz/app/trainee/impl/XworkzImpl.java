package com.xworkz.app.trainee.impl;

import com.xworkz.app.trainee.Trainnee;

public class XworkzImpl implements Trainnee {


    @Override
    public void registerCourse() {
        System.out.println("course registered");
    }

    @Override
    public void rehisterStudent() {
        System.out.println("student rgisterd");
    }

    @Override
    public void assignTrainer() {
        System.out.println("trainer assigned");
    }
}
