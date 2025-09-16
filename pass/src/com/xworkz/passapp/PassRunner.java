package com.xworkz.passapp;

import com.xworkz.passapp.pass.Pass;
import com.xworkz.passapp.pass.impl.BoardingPass;

public class PassRunner {
    public static void main(String[] args) {
        Pass pass = new BoardingPass();
        pass.print();
        pass.scan();
        pass.validateFlight();
    }
}
