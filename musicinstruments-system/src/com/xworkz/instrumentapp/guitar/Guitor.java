package com.xworkz.instrumentapp.guitar;

import com.xworkz.instrumentapp.instrucment.Instrument;

public class Guitor extends Instrument {
    public Guitor(){
        super();
        System.out.println("Guitor cons is invoked");
    }
    @Override
    public void toPlay(){
        System.out.println("to play melody music");
    }
}
