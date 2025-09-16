package com.xworkz.mobile.mobile.impl;

import com.xworkz.mobile.mobile.Mobile;

public class SamsumgImpl implements Mobile {
    @Override
    public void toCapture() {
        System.out.println("Samsung phone using to Capture image");
    }

    @Override
    public void toContact() {
        System.out.println("Samsung phone using to contact");
    }

    @Override
    public void takeUpdate() {
        System.out.println("Samsung phone using to take update");
    }
}
