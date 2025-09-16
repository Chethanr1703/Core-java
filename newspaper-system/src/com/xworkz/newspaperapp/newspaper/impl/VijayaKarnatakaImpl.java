package com.xworkz.newspaperapp.newspaper.impl;

import com.xworkz.newspaperapp.newspaper.NewsPaper;


public class VijayaKarnatakaImpl implements NewsPaper {
    @Override
    public void deliverInformation() {
        System.out.println("deliver information");
    }

    @Override
    public void read() {
        System.out.println("read the newspaper");
    }

    @Override
    public void clean() {
        System.out.println("to clean");
    }
}
