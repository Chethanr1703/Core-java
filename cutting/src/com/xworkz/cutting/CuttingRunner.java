package com.xworkz.cutting;

import com.xworkz.cutting.cut.Cutting;
import com.xworkz.cutting.cut.impl.KnifeImpl;

public class CuttingRunner {
    public static void main(String[] args) {
        Cutting cutting =new KnifeImpl();
        cutting.clean();
        cutting.sharpen();
        cutting.cut();
    }
}
