package com.xworkz.instrumentapp;

import com.xworkz.instrumentapp.guitar.Guitor;
import com.xworkz.instrumentapp.instrucment.Instrument;

public class InstrumentRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Instrument instrument1 = new Guitor();
        instrument1.toPlay();
        System.out.println("main ended");

    }
}
