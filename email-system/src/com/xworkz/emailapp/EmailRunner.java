package com.xworkz.emailapp;

import com.xworkz.emailapp.email.Email;
import com.xworkz.emailapp.email.impl.EmailImpl;

public class EmailRunner {public static void main(String[] args) {
    Email email = new EmailImpl();
    email.sendEmail();
    email.receiveEmail();
    email.deleteEmail();
}

}
