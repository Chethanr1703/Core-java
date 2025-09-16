package com.xworkz.needleapp;

import com.xworkz.needleapp.needle.Needle;
import com.xworkz.needleapp.needle.impl.SmallNeedle;

public class NeedleRunner {
    public static void main(String[] args) {
        Needle needle = new SmallNeedle();
        needle.sew();
        needle.thread();
        needle.repair();
    }
}
