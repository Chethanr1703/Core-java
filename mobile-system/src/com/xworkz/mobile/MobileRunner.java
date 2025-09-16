package com.xworkz.mobile;

import com.xworkz.mobile.mobile.Mobile;
import com.xworkz.mobile.mobile.impl.SamsumgImpl;

public class MobileRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Mobile mobile = new SamsumgImpl();
        mobile.takeUpdate();
        mobile.toCapture();
        mobile.toContact();

        System.out.println("main ended");
    }
}
