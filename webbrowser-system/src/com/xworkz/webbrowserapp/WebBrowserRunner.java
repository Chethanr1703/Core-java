package com.xworkz.webbrowserapp;

import com.xworkz.webbrowserapp.firefox.FireFox;

public class WebBrowserRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        FireFox browser1 = new FireFox();
        System.out.println("main ended");

    }
}
