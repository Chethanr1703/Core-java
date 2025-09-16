package com.xworkz.waletapp;

import com.xworkz.waletapp.wallet.Wallet;
import com.xworkz.waletapp.wallet.impl.PurseImpl;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet =new PurseImpl();
        wallet.storeCash();
        wallet.organizeCards();
        wallet.retrieveCash();
    }
}
