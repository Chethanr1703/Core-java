package com.xworkz.businessmenapp.ratantata;

import com.xworkz.businessmenapp.bussiness.Bussinessmen;

public class RatanTata extends Bussinessmen {
    public RatanTata(){
        super();
        System.out.println("Ratan tata cons is invoked");
    }
    @Override
    public void toDoBusiness(){
        System.out.println("business in Technology fields");
    }
}
