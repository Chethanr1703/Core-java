package com.xworkz.watchapp.watchshop.impl;

import com.xworkz.watchapp.contants.WaterResistant;
import com.xworkz.watchapp.exception.*;
import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;
import com.xworkz.watchapp.watchvalidator.WatchValidator;

public class WatchShopImpl implements WatchShop {
    Watch watchs[];
    int index;

    public WatchShopImpl(int size) {
        watchs = new Watch[size];
    }

    @Override
    public boolean isWatchAdded(Watch watch) {
        boolean isWatchAdd = false;

        WatchValidator watchValidator = new WatchValidator();
        boolean isWatchValid = watchValidator.isWatchDetailsValid(watch);
        try {
            if (isWatchValid) {
//            this.watch=watch;
                watchs[index] = watch;
                index++;
                isWatchAdd=true;
            }
            if (isWatchValid == false) {
                throw new WatchNotAddedException("the Details  of the watch is not valid");
            }
        } catch (WatchNotAddedException e) {
            e.printStackTrace();
        }

        return isWatchAdd;


    }

    @Override
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

    @Override
    public String getCompanyNameByModelName(String modelName) {
        String companyName = null;
        try {
            if (modelName != null) {
                for (Watch watch : watchs) {
                    if (watch.getModelName().equals(modelName)) {
                        companyName = watch.getCompanyName();
                    }
                }
            }
            if (companyName == null) {
                throw new CompanyNameNotFoundException("model name is not valid to get companyName");
            }
        } catch (CompanyNameNotFoundException e) {
            e.printStackTrace();
        }
        return companyName;
    }

    @Override
    public String getCompanyNameById(int id) {
        String companyName = null;
        try {
            if (id != 0) {
                for (Watch watch : watchs) {
                    if (watch.getId() == id) {
                        companyName = watch.getCompanyName();
                    }
                }
            }
            if (companyName == null) {
                throw new CompanyNameNotFoundException("id is not valid to get companyName");
            }
        } catch (CompanyNameNotFoundException e) {
            e.printStackTrace();
        }
        return companyName;
    }

    @Override
    public double getPriceByid(int id) {
        double price = 0;
        try {
            if (id != 0) {
                for (Watch watch : watchs) {
                    if (watch.getId() == id) {
                        price = watch.getPrice();
                    }
                }
            }
            if (price <= 0.0) {
                throw new PriceNotFoundException("id is not valid to get price");
            }
        } catch (PriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public String getWarrentyById(int id) {
        String warrrent = null;
        try {
            if (id != 0) {
                for (Watch watch : watchs) {
                    if (watch.getId() == id) {
                        warrrent = watch.getWarrenty();
                    }
                }
            }
            if (warrrent == null) {
                throw new WarrentyNotFoundException("id is not valid to get warrrent");
            }
        } catch (WarrentyNotFoundException e) {
            e.printStackTrace();
        }
        return warrrent;
    }

    @Override
    public WaterResistant getWaterResistantById(int id) {
        WaterResistant waterResistant = null;
        try {
            if (id != 0) {
                for (Watch watch : watchs) {
                    if (watch.getId() == id) {
                        waterResistant = watch.getWaterResistant();
                    }
                }
            }
            if (waterResistant == null) {
                throw new WaterResistantNotFoundException("id is not valid to get waterResistant");
            }
        } catch (WaterResistantNotFoundException e) {
            e.printStackTrace();
        }
        return waterResistant;
    }

    @Override
    public String getModelnameById(int id) {
        String modelName = null;
        try {
            if (id != 0) {
                for (Watch watch : watchs) {
                    if (watch.getId() == id) {
                        modelName = watch.getModelName();
                    }
                }
            }
            if (modelName == null) {
                throw new ModelNameNotFoundException("id is not valid to get modelName");
            }
        } catch (ModelNameNotFoundException e) {
            e.printStackTrace();
        }
        return modelName;

    }

    @Override
    public double getPriceByModelName(String modelName) {
        double price = 0;
        try {
            if (modelName != null) {
                for (Watch watch : watchs) {
                    if (watch.getModelName().equals(modelName)) {
                        price = watch.getPrice();
                    }
                }
            }
            if (price <= 0.0) {
                throw new PriceNotFoundException("model name is not valid to get price");
            }
        } catch (PriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;

    }

    @Override
    public WaterResistant getWaterResistantByModelName(String modelName) {
        WaterResistant waterResistant = null;
        try {
            if (modelName != null) {
                for (Watch watch : watchs) {
                    if (watch.getModelName().equals(modelName)) {
                        waterResistant = watch.getWaterResistant();
                    }
                }
            }
            if (waterResistant == null) {
                throw new WaterResistantNotFoundException("model name is not valid to get waterResistant");
            }
        } catch (WaterResistantNotFoundException e) {
            e.printStackTrace();
        }
        return waterResistant;
    }

    @Override
    public Watch getWatchById(int id) {
        Watch watch = null;
        try {
            if (id > 0) {
                for (Watch watch1 : watchs) {
                    if (watch1.getId() == id) {
                        watch = watch1;
                    }
                }
            }
            if (watch == null) {
                throw new WatchNotFoundException("id to get Watch is invalid");
            }
        } catch (WatchNotFoundException e) {
            e.printStackTrace();
        }
        return watch;
    }

    //
    @Override
    public boolean updateModelNameById(int id, String modelName) {
        boolean ismodelNameUpdate = false;
        try {
            if (id != 0) {
                for (Watch watch : watchs) {
                    if (watch.getId() == id) {
                        watch.setModelName(modelName);
                        ismodelNameUpdate = true;
                    }
                }
            }
            if (ismodelNameUpdate == false) {
                throw new ModelNameNotupdatedException("the id entered to updated model name is not valid");
            }
        } catch (ModelNameNotupdatedException e) {
            e.printStackTrace();
        }
        return ismodelNameUpdate;
    }

    @Override
    public boolean updateCompanyNameByModelName(String modelName, String companyName) {
        boolean iscompanyNameUpdate = false;
        try {
            if (modelName != null) {
                for (Watch watch : watchs) {
                    if (watch.getModelName().equals(modelName)) {
                        watch.setCompanyName(companyName);
                        iscompanyNameUpdate = true;
                    }
                }
            }
            if (iscompanyNameUpdate == false) {
                throw new CompanyNameNotUpdatedException("the model name entered to updated company name is not valid");
            }
        } catch (CompanyNameNotUpdatedException e) {
            e.printStackTrace();
        }
        return iscompanyNameUpdate;
    }

    @Override
    public boolean updateWaterResistantByModelName(String modelName, WaterResistant waterResistant) {
        boolean isWaterResistUpdate = false;
        try {
            if (modelName != null) {
                for (Watch watch : watchs) {
                    if (watch.getModelName().equals(modelName)) {
                        watch.setWaterResistant(waterResistant);
                        isWaterResistUpdate = true;
                    }
                }
            }
            if (isWaterResistUpdate == false) {
                throw new WaterResistantNotUpdatedException("the model name entered to updated water resist  is not valid");
            }
        } catch (WaterResistantNotUpdatedException e) {
            e.printStackTrace();
        }
        return isWaterResistUpdate;
    }

    @Override
    public void getDetailsWatch(Watch watch) {
        try {
            if (watch != null) {
                System.out.println("the id of the watch is  " + watch.getId());
                System.out.println("the model of the watch is  " + watch.getModelName());
                System.out.println("the cName of the watch is  " + watch.getCompanyName());
                System.out.println("the price of the watch is  " + watch.getPrice());
                System.out.println("the warrent of the watch is  " + watch.getWarrenty());
                System.out.println("the water resistant of the watch is  " + watch.getWaterResistant());
                System.out.println(" ");
            } else {
                throw new WatchNotFoundException("watch info is invalid");
            }
        } catch (WatchNotFoundException e) {
            e.printStackTrace();
        }

    }
}
