package com.xworkz.bedapp;

import com.xworkz.bedapp.bed.Bed;
import com.xworkz.bedapp.bed.impl.EmmaMatrixsimpl;

public class BedRunner {
    public static void main(String[] args) {

        Bed bed = new EmmaMatrixsimpl();
        bed.toSleep();
        bed.adjustPosition();
        bed.supportBody();
    }
}
