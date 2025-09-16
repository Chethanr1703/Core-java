package com.xworkz.passapp.pass.impl;

import com.xworkz.passapp.pass.Pass;
 public  class BoardingPass  implements Pass {
        @Override
        public void scan() {
            System.out.println("do scanning");
        }

        @Override
        public void print() {
            System.out.println("to print ");
        }

        @Override
        public void validateFlight() {
            System.out.println("validate");
        }
    }

