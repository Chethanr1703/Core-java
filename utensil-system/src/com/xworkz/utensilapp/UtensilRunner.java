package com.xworkz.utensilapp;

import com.xworkz.utensilapp.spoon.Spoon;
import com.xworkz.utensilapp.utensil.Utensil;

public class UtensilRunner {

        public static void main(String[] args) {
            System.out.println("main started");
            Utensil utensil1 = new Spoon();
            utensil1.toFeed();
            System.out.println("main ended");

        }

}
