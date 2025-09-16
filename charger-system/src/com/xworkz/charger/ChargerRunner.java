package com.xworkz.charger;

import com.xworkz.charger.charger.Charger;
import com.xworkz.charger.charger.phonecharger.PhoneCharger;

public class ChargerRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        Charger charger = new PhoneCharger();
        charger.toChargeDevice();
        charger.monitorChargingStatus();
        charger.toControlOverload();
        System.out.println("main ended");
    }
}
