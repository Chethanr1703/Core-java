package com.xworkz.managerapp;

import com.xworkz.managerapp.manager.impl.ManagerImpl;
import com.xworkz.managerapp.manager.Manager;

public class ManagerRunner {

    public static void main(String[] args) {
        Manager manager = new ManagerImpl();
        manager.assignTasks();
        manager.motivateTeam();
        manager.reviewPerformance();

    }
}
