package com.xworkz.tvapp;

import com.xworkz.tvapp.tv.Tv;
import com.xworkz.tvapp.tv.impl.SmartTvimpl;

public class TvRunner {
    public static void main(String[] args) {

        Tv tv = new SmartTvimpl();
        tv.turnOn();
        tv.turnOff();
        tv.changeChannel();


    }
}
