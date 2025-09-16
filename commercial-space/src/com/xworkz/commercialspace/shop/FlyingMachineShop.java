package com.xworkz.commercialspace.shop;

import com.xworkz.commercialspace.commercial.Commercial;

public class FlyingMachineShop implements Commercial {
    public FlyingMachineShop(){}

    @Override
    public void doBusiness(){
        System.out.println("doing cloth business");
    }
}

//    public class FlyingMachineShop extends Commercial {
//        @Override
//        public void doBusiness(){
//            System.out.println("doing cloth business");
//        }
//}
