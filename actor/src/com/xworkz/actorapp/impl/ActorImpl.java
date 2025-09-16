package com.xworkz.actorapp.impl;

import com.xworkz.actorapp.actor.Actor;

public class ActorImpl implements Actor {
    @Override
    public void rehearseRole() {
        System.out.println("rehearseRole");
    }

    @Override
    public void actOnStage() {
        System.out.println("act on stage");
    }

    @Override
    public void acting() {
        System.out.println("acting");
    }
}
