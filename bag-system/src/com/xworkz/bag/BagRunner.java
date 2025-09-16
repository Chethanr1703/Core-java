package com.xworkz.bag;

import com.xworkz.bag.bag.Bag;
import com.xworkz.bag.bag.impl.SchoolBag;

public class BagRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Bag bag = new SchoolBag();
        bag.toCarryBooks();
        bag.toCarryProducts();
        bag.helpToHandle();

        System.out.println("main ended");
    }
}
