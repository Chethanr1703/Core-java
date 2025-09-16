package com.xworkz.newspaperapp;

import com.xworkz.newspaperapp.newspaper.NewsPaper;

import com.xworkz.newspaperapp.newspaper.impl.VijayaKarnatakaImpl;

public class NewsPaperRunner {
    public static void main(String[] args) {
        NewsPaper newspaper = new VijayaKarnatakaImpl();
        newspaper.deliverInformation();
        newspaper.read();
        newspaper.clean();
    }


}
