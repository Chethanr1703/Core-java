package com.xworkz.creditcard;

import com.xworkz.creditcard.credit.Credit;
import com.xworkz.creditcard.credit.impl.PvrCard;

public class CardRunner {
    public static void main(String[] args) {
        Credit pvrCard  = new PvrCard();
        pvrCard.payBill();
        pvrCard.checkCreditLimit();
        pvrCard.makePayment();
    }

}
