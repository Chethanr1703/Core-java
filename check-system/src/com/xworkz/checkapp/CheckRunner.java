package com.xworkz.checkapp;

import com.xworkz.checkapp.checker.Checker;
import com.xworkz.checkapp.checker.impl.TicketImpl;

public class CheckRunner {
    public static void main(String[] args) {
        Checker checker = new TicketImpl();
        checker.toValidate();;
        checker.cancel();
        checker.reissue();
    }
}
