package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.contants.WaterResistant;
import com.xworkz.watchapp.watch.Watch;

public interface WatchShop {
    boolean isWatchAdded(Watch watch);
    void getDetailsWatch();
    String getCompanyNameByModelName(String modelName);
    String getCompanyNameById(int id);
    double getPriceByid(int id);
    String getWarrentyById(int id);
    WaterResistant getWaterResistantById(int id);
    String getModelnameById(int id);
    double getPriceByModelName(String modelName);
    WaterResistant getWaterResistantByModelName(String modelName);
    Watch getWatchById(int id);
    boolean updateModelNameById(int id, String modelName);
    boolean updateCompanyNameByModelName(String modelName, String companyName);
    boolean updateWaterResistantByModelName(String modelName, WaterResistant waterResistant);
    void getDetailsWatch(Watch watch);
}
