package com.xworkz.shampooapp;

import com.xworkz.shampooapp.shampoo.Shampoo;
import com.xworkz.shampooapp.shampoo.impl.DoveSampoo;

public class ShampooRunner {
    public static void main(String[] args) {
        Shampoo shampoo = new DoveSampoo();
        shampoo.apply();
        shampoo.massage();
        shampoo.rinse();
    }
}
