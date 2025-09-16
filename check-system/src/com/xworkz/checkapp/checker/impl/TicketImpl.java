package com.xworkz.checkapp.checker.impl;

import com.xworkz.checkapp.checker.Checker;

public class TicketImpl implements Checker {

    @Override
    public void toValidate() {
        System.out.println(" to validate");
    }

    @Override
    public void cancel() {
        System.out.println(" to cancel");
    }

    @Override
    public void reissue() {
        System.out.println(" to reissue");
    }
}
