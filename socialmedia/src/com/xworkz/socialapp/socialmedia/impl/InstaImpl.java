package com.xworkz.socialapp.socialmedia.impl;

import com.xworkz.socialapp.socialmedia.Media;

public class InstaImpl implements Media {
    @Override
    public void doVideo() {
        System.out.println("do Video");
    }

    @Override
    public void doPost() {
        System.out.println("do post");
    }
}
