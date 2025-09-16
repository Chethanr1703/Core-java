package com.xworkz.directorapp;

import com.xworkz.directorapp.Director.Director;
import com.xworkz.directorapp.impl.Directorimpl;

public class DirectorRunner {

    public static void main(String[] args) {
        Director director = new Directorimpl();
        director.planScenes();
        director.directActors();
        director.finalizeFilm();
    }
}
