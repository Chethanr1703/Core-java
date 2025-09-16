package com.xworkz.needleapp.needle.impl;

import com.xworkz.needleapp.needle.Needle;

public class SmallNeedle implements Needle {
    @Override
    public void sew() {
        System.out.println("Sewing the cloth");
    }

    @Override
    public void thread() {
        System.out.println("using the thread");
    }

    @Override
    public void repair() {
        System.out.println("using for repair");
    }
}
