package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.contants.WaterResistant;
import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchvalidator.WatchValidator;

public class WatchShop {
    Watch watchs[];
    int index;

    public WatchShop(int size) {
        watchs = new Watch[size];
    }

    public boolean isWatchAdded(Watch watch) {
        boolean isWatchAdd = false;

        WatchValidator watchValidator = new WatchValidator();
        boolean isWatchValid = watchValidator.isWatchDetailsValid(watch);

        if (isWatchValid) {
//            this.watch=watch;
            watchs[index] = watch;
            index++;
        } else {
            System.out.println("the Details  of the watch is not valid");
        }
        return isWatchValid;


    }

    public void getDetailsWatch() {
        for (Watch watch : watchs) {
            System.out.println("the id of the watch is  " + watch.getId());
            System.out.println("the model of the watch is  " + watch.getModelName());
            System.out.println("the cName of the watch is  " + watch.getCompanyName());
            System.out.println("the price of the watch is  " + watch.getPrice());
            System.out.println("the warrent of the watch is  " + watch.getWarrenty());
            System.out.println("the water resistant of the watch is  " + watch.getWaterResistant());
            System.out.println(" ");
        }
    }


    public String getCompanyNameByModelName(String modelName) {
        String companyName = null;
        if (modelName != null) {
            for (Watch watch : watchs) {
                if (watch.getModelName().equals(modelName)) {
                    companyName = watch.getCompanyName();
                }
            }
        } else System.out.println("model name is not valid to get companyName");
        return companyName;
    }


    public String getCompanyNameById(int id) {
        String companyName = null;
        if (id != 0) {
            for (Watch watch : watchs) {
                if (watch.getId() == id) {
                    companyName = watch.getCompanyName();
                }
            }
        } else System.out.println("id is not valid to get companyName");
        return companyName;
    }


    public double getPriceByid(int id) {
        double price = 0;
        if (id != 0) {
            for (Watch watch : watchs) {
                if (watch.getId() == id) {
                    price = watch.getPrice();
                }
            }
        } else System.out.println("id is not valid to get price");
        return price;
    }

    public String getWarrentyById(int id) {
        String warrrent = null;
        if (id != 0) {
            for (Watch watch : watchs) {
                if (watch.getId() == id) {
                    warrrent = watch.getWarrenty();
                }
            }
        } else System.out.println("id is not valid to get warrrent");
        return warrrent;
    }

    public WaterResistant getWaterResistantById(int id) {
        WaterResistant waterResistant = null;
        if (id != 0) {
            for (Watch watch : watchs) {
                if (watch.getId() == id) {
                    waterResistant = watch.getWaterResistant();
                }
            }
        } else System.out.println("id is not valid to get waterResistant");
        return waterResistant;
    }

    public String getModelnameById(int id) {
        String modelName = null;
        if (id != 0) {
            for (Watch watch : watchs) {
                if (watch.getId() == id) {
                    modelName = watch.getModelName();
                }
            }
        } else System.out.println("id is not valid to get modelName");
        return modelName;

    }

    public double getPriceByModelName(String modelName) {
        double price = 0;
        if (modelName != null) {
            for (Watch watch : watchs) {
                if (watch.getModelName().equals(modelName)) {
                    price = watch.getPrice();
                }
            }
        } else System.out.println("id is not valid to get price");
        return price;

    }

    public WaterResistant getWaterResistantByModelName(String modelName) {
        WaterResistant waterResistant = null;
        if (modelName != null) {
            for (Watch watch : watchs) {
                if (watch.getModelName().equals(modelName)) {
                    waterResistant = watch.getWaterResistant();
                }
            }
        } else System.out.println("id is not valid to get waterResistant");
        return waterResistant;
    }

    public Watch getWatchById(int id) {
        Watch watch = null;
        if (id > 0) {
            for (Watch watch1 : watchs) {
                if (watch1.getId() == id) {
                    watch = watch1;
                }
            }
        } else System.out.println("id to get Watch is invalid");
        return watch;
    }

    //
    public boolean updateModelNameById(int id, String modelName) {
        boolean ismodelNameUpdate = false;
        if (id != 0) {
            for (Watch watch : watchs) {
                if (watch.getId() == id) {
                    watch.setModelName(modelName);
                    ismodelNameUpdate = true;
                }
            }
        } else System.out.println("the id entered to updated model name is not valid");
        return ismodelNameUpdate;
    }

    public boolean updateCompanyNameByModelName(String modelName, String companyName) {
        boolean iscompanyNameUpdate = false;
        if (modelName != null) {
            for (Watch watch : watchs) {
                if (watch.getModelName().equals(modelName)) {
                    watch.setCompanyName(companyName);
                    iscompanyNameUpdate = true;
                }
            }
        } else System.out.println("the model name entered to updated company name is not valid");
        return iscompanyNameUpdate;
    }

    public boolean updateWaterResistantByModelName(String modelName, WaterResistant waterResistant) {
        boolean isWaterResistUpdate = false;
        if (modelName != null) {
            for (Watch watch : watchs) {
                if (watch.getModelName().equals(modelName)) {
                    watch.setWaterResistant(waterResistant);
                    isWaterResistUpdate = true;
                }
            }
        } else System.out.println("the model name entered to updated water resist  is not valid");
        return isWaterResistUpdate;
    }


    public void getDetailsWatch(Watch watch) {

        System.out.println("the id of the watch is  " + watch.getId());
        System.out.println("the model of the watch is  " + watch.getModelName());
        System.out.println("the cName of the watch is  " + watch.getCompanyName());
        System.out.println("the price of the watch is  " + watch.getPrice());
        System.out.println("the warrent of the watch is  " + watch.getWarrenty());
        System.out.println("the water resistant of the watch is  " + watch.getWaterResistant());
        System.out.println(" ");


    }
}
