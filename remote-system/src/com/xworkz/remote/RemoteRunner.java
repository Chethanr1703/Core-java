package com.xworkz.remote;

import com.xworkz.remote.remote.RemoteControler;
import com.xworkz.remote.remote.impl.TvRemote;

public class RemoteRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        RemoteControler remoteControler = new TvRemote();
        remoteControler.increaseVolume();
        remoteControler.decreaseVolume();
        remoteControler.turnOff();


        System.out.println("main ended");
    }
}
