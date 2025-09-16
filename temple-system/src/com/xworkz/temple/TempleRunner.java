package com.xworkz.temple;

import com.xworkz.temple.temple.WorkshipPlace;
import com.xworkz.temple.temple.impl.GaneshaTempleImpl;

public class TempleRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        WorkshipPlace workshipPlace =new GaneshaTempleImpl();
        workshipPlace.doPooja();
        workshipPlace.toMeditate();
        workshipPlace.toPrayer();

        System.out.println("main ended");
    }
}
