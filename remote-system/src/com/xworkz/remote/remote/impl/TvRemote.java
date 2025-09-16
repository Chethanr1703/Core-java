package com.xworkz.remote.remote.impl;

import com.xworkz.remote.remote.RemoteControler;

public class TvRemote implements RemoteControler {
    @Override
    public void increaseVolume() {
        System.out.println("increasing the tv volume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("decreasing the tv volume");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the tv ");
    }
}
