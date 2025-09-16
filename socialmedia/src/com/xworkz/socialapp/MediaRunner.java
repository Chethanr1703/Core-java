package com.xworkz.socialapp;

import com.xworkz.socialapp.socialmedia.Media;
import com.xworkz.socialapp.socialmedia.impl.InstaImpl;

public class MediaRunner {
    public static void main(String[] args) {
        Media  media = new InstaImpl();
        media .doPost();;
        media.doVideo();
    }
}
