package com.xworkz.actorapp;

import com.xworkz.actorapp.actor.Actor;
import com.xworkz.actorapp.impl.ActorImpl;

public class ActorRunner {

    public static void main(String[] args) {

        Actor actor = new ActorImpl();

        actor.acting();
        actor.actOnStage();
        actor.rehearseRole();
    }
}
