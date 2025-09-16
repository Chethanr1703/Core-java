package com.xworkz.waletapp.wallet.impl;

import com.xworkz.waletapp.wallet.Wallet;

public class PurseImpl implements Wallet {
    @Override
    public void storeCash() {
        System.out.println("storing cash and cards");
    }

    @Override
    public void retrieveCash() {
        System.out.println("retriving cash");
    }

    @Override
    public void organizeCards() {
        System.out.println("organzing cardds");
    }
}
