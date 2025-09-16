package com.xworkz.charger.charger.phonecharger;

import com.xworkz.charger.charger.Charger;

public class PhoneCharger implements Charger {
    @Override
    public void toChargeDevice() {
        System.out.println("to charger the phone");
    }

    @Override
    public void monitorChargingStatus() {
        System.out.println("displaying chargering status");
    }

    @Override
    public void toControlOverload() {
        System.out.println("control the over charger");
    }
}
