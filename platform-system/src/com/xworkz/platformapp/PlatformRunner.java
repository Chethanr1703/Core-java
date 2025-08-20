package com.xworkz.platformapp;

import com.xworkz.platformapp.platform.Platform;

public class PlatformRunner {
    public static void main(String[] args) {

        Platform platform1 =new Platform();

        platform1.setId(101);
       int id= platform1.getId();
        platform1.setPlatformName("A");
       String name= platform1.getPlatformName();
        platform1.setNoOfofficer(15);
        int noOfofficer=platform1.getNoOfofficer();

        platform1.getPlatforminfo();
    }
}
