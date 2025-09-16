package com.xworkz.directorapp.impl;

import com.xworkz.directorapp.Director.Director;

public class Directorimpl implements Director {

    @Override
    public void planScenes() { System.out.println("Director planning scenes"); }
    @Override
    public void directActors() { System.out.println("Director guiding actors"); }
    @Override
    public void finalizeFilm() { System.out.println("Director finalizing the film"); }

}
