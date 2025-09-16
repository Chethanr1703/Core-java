package com.xworkz.coverapp;

import com.xworkz.coverapp.cover.Cover;
import com.xworkz.coverapp.cover.impl.PlasticCoverImpl;

public class CoverRunner {
    public static void main(String[] args) {
        Cover cover = new PlasticCoverImpl();
        cover.toStore();
        cover.toCarrt();
    }
}
