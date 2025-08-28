package com.xworkz.brandapp.bata;

import com.xworkz.brandapp.brand.Brand;

public class Bata extends Brand {
    public Bata(){
        super();
        System.out.println("Bata cons is invoked");
    }
    @Override
    public void toProvide(){
        System.out.println("to provide  all type of shoes");
    }
}
