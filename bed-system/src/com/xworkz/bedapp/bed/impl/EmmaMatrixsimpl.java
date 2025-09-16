package com.xworkz.bedapp.bed.impl;

import com.xworkz.bedapp.bed.Bed;

public class EmmaMatrixsimpl implements Bed {
    @Override
    public void supportBody() {
        System.out.println("support Body");
    }

    @Override
    public void adjustPosition() {
        System.out.println("adjust Position");

    }

    @Override
    public void toSleep() {
        System.out.println("for good sllep");

    }
}
