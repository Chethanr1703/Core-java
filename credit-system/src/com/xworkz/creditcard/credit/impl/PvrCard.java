package com.xworkz.creditcard.credit.impl;

import com.xworkz.creditcard.credit.Credit;

public class PvrCard implements Credit {
    @Override
    public void makePayment() {
        System.out.println("payment made");
    }

    @Override
    public void payBill() {
        System.out.println("bill payed");
    }

    @Override
    public void checkCreditLimit() {
        System.out.println("credit card limit is checked");
    }
}
