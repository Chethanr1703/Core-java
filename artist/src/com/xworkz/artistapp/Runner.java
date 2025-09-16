package com.xworkz.artistapp;

import com.xworkz.artistapp.artist.Artist;
import com.xworkz.artistapp.impl.ArtistImpl;

public class Runner {

    public static void main(String[] args) {
        Artist artist = new ArtistImpl();
        artist.imagine();
        artist.create();
        artist.showcase();
    }
}
