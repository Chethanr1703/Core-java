package com.xworkz.workerapp.farmer;

import com.xworkz.workerapp.worker.Worker;

public class Farmer extends Worker {
    public Farmer(){
        super();
        System.out.println("Farmer cons is invoked");
    }
    @Override
    public void toWork(){
        System.out.println("to work for money and to do agriculture");
    }
}
