package com.xworkz.watchapp.watchvalidator;

import com.xworkz.watchapp.watch.Watch;

public class WatchValidator {
    public boolean isWatchDetailsValid(Watch watch){
        boolean isWatchValid=false;
        boolean isIdValid=false;
        boolean isModelNameValid=false;
        boolean isCompanyNameValid= false;
        boolean ispriceValid=false;
        boolean isWarrentValid=false;

        if(watch.getId()>0){
            isIdValid=true;
        }else{
            System.out.println("the id of the watch is not valid");
        }
        if(watch.getModelName()!=null && !watch.getModelName().isEmpty()){
            isModelNameValid=true;
        }else{
            System.out.println("the model name of the watch is not valid");
        }
        if(watch.getCompanyName()!=null && !watch.getCompanyName().isEmpty()){
            isCompanyNameValid=true;
        }else{
            System.out.println("the company name of the watch is not valid");
        }
        if(watch.getPrice()>0){
            ispriceValid=true;
        }
        else{
            System.out.println("the price of the watch is not valid");
        }
        if(watch.getWarrenty()!=null && !watch.getWarrenty().isEmpty()){
            isWarrentValid=true;
        }else{
            System.out.println("the warrent of the watch is not valid");
        }
        if(isIdValid&& isModelNameValid && isCompanyNameValid && ispriceValid && isWarrentValid){
            isWatchValid=true;
        }else{
            System.out.println("the info of the watch is not valid");
        }
        return  isWatchValid;
    }
}
