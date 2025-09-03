package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchvalidator.WatchValidator;

public class WatchShop {
    Watch watchs[] =new Watch[9] ;
    int index;
    public boolean isWatchAdded(Watch watch){
        boolean isWatchAdd =false;

        WatchValidator watchValidator =new WatchValidator();
        boolean isWatchValid = watchValidator.isWatchDetailsValid(watch);

        if(isWatchValid){
//            this.watch=watch;
            watchs[index] = watch;
            index++;
        }else{
            System.out.println("the Details  of the watch is not valid");
        }
        return  isWatchValid;


        }
    public void getDetailsWatch(){
        for(Watch watch: watchs) {
            System.out.println("the id of the watch is  " + watch.getId());
            System.out.println("the model of the watch is  " + watch.getModelName());
            System.out.println("the cName of the watch is  " + watch.getCompanyName());
            System.out.println("the price of the watch is  " + watch.getPrice());
            System.out.println("the warrent of the watch is  " + watch.getWarrenty());
            System.out.println(" ");
        }
    }
}
