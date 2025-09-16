package com.xworkz.coverapp.cover.impl;

import com.xworkz.coverapp.cover.Cover;

public class PlasticCoverImpl implements Cover {
    @Override
    public void toStore() {
        System.out.println(" to store");
    }

    @Override
    public void toCarrt() {
        System.out.println("to carry");
    }
}
