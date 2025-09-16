package com.xworkz.emailapp.email.impl;

import com.xworkz.emailapp.email.Email;

public class EmailImpl implements Email {
    @Override
    public void sendEmail() {
        System.out.println("Email sent successfully");
    }

    @Override
    public void receiveEmail() {
        System.out.println("New email received");
    }

    @Override
    public void deleteEmail() {
        System.out.println("Email deleted");
    }
}
