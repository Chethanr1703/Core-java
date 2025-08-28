package com.xworkz.shokeapp;

import com.xworkz.shokeapp.nifty50.Nifty50;
import com.xworkz.shokeapp.stock.Stock;

public class StockRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Stock stock = new Nifty50();
        stock.toInvest();
        System.out.println("main ended");

    }
}
