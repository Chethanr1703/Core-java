package com.xworkz.temple.temple.impl;

import com.xworkz.temple.temple.WorkshipPlace;

public class GaneshaTempleImpl implements WorkshipPlace {
    @Override
    public void doPooja() {
        System.out.println("doing pooja in temple");
    }

    @Override
    public void toMeditate() {
        System.out.println("doing meditation in temple");
    }

    @Override
    public void toPrayer() {
        System.out.println("doing prayer in temple");
    }
}
