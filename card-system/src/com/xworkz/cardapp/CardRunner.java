package com.xworkz.cardapp;

import com.xworkz.cardapp.card.Card;
import com.xworkz.cardapp.card.impl.AddharCardImpl;

public class CardRunner {
    public static void main(String[] args) {
        Card card = new AddharCardImpl();
        card.containName();
        card.containId();
    }
}
