package com.xworkz.artistapp.impl;

import com.xworkz.artistapp.artist.Artist;

public class ArtistImpl implements Artist {

    @Override
    public void imagine() { System.out.println("Artist imagining artwork"); }
    @Override
    public void create() { System.out.println("Artist creating artwork"); }
    @Override
    public void showcase() { System.out.println("Artist showcasing artwork"); }
}
