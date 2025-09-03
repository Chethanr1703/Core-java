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

        Watch watch1 = new Watch(962,"125698","Sonata",1235.0,"3 years");
        Watch watch2 = new Watch(882,"789654","Titan",3235.0,"3 years");
        Watch watch3 = new Watch(702,"125698","HTM",2235.0,"3 years");
        Watch watch4 = new Watch(602,"895623","Fasttrack",4235.0,"3 years");
        Watch watch5 = new Watch(502,"789546","Sonata",3235.0,"3 years");
        Watch watch6 = new Watch(402,"123569","titan",2505.0,"3 years");
        Watch watch7 = new Watch(302,"125698","g shock",2235.0,"3 years");
        Watch watch8 = new Watch(203,"856243","sports",1205.0,"3 years");


        WatchShop watchShop =new WatchShop();
        boolean isAdded=watchShop.isWatchAdded(watch);
        isAdded = watchShop.isWatchAdded(watch1);
        isAdded = watchShop.isWatchAdded(watch2);
        isAdded = watchShop.isWatchAdded(watch3);
        isAdded = watchShop.isWatchAdded(watch4);
        isAdded = watchShop.isWatchAdded(watch5);
        isAdded = watchShop.isWatchAdded(watch6);
        isAdded = watchShop.isWatchAdded(watch7);
        isAdded = watchShop.isWatchAdded(watch8);

        if(isAdded){
            watchShop.getDetailsWatch();

        }else{
            System.out.println("details are not vaid");
        }
    }
}
