package com.xworkz.shokeapp.nifty50;

import com.xworkz.shokeapp.stock.Stock;

public class Nifty50 extends Stock {
    public Nifty50(){
        super();
        System.out.println("Nifty50 cons is invoked");
    }
    @Override
    public void  toInvest(){
        System.out.println("to invest for future and in high returns");
    }
}
