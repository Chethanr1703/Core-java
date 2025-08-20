package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch =new Watch();
        watch.setId(2);
        watch.setModelName("12265");
        watch.setCompanyName("HMT");
        watch.setPrice(1250.0);
        watch.setWarrenty("4 years");

        WatchShop watchShop =new WatchShop();
        boolean isAdded=watchShop.isWatchAdded(watch);

        if(isAdded){
            watchShop.getDetailsWatch();

        }else{
            System.out.println("details are not vaid");
        }
    }
}
