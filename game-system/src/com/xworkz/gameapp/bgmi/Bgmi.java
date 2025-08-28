package com.xworkz.gameapp.bgmi;

import com.xworkz.gameapp.game.Game;

public class Bgmi extends Game {
    public Bgmi(){
        super();
        System.out.println("Bgmi cons is invoked");
    }
    @Override
    public void fun(){
        System.out.println("give fun playing bgmi ");
    }
}
