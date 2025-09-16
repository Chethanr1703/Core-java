package com.xworkz.managerapp.manager.impl;

import com.xworkz.managerapp.manager.Manager;

public class ManagerImpl implements Manager {

    @Override
    public void assignTasks() { System.out.println(" assigning tasks to team"); }
    @Override
    public void motivateTeam() { System.out.println("Manager motivating the team"); }
    @Override
    public void reviewPerformance() { System.out.println("Manager reviewing team performance"); }
}
