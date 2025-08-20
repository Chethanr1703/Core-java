package com.xworkz.playstore;

import com.xworkz.playstore.playstore.PlayStore;
import com.xworkz.playstore.user.User;

public class PlayStoreRunner {
    public static void main(String[] args) {
        User user = new User();
        user.setUserId(1);
        user.setFirstName("chethan ");
        user.setLastName("R");
        user.setAge(20);
        user.setGender('M');
        user.setDob("17-08-2003");
        user.setPhoneNumber(9632027324l);
        user.setEmail("chethan@gmail.com");
        user.setAddress("#173 laggere");
        user.setCountry("India");
        user.setState("karnataka");
        user.setCity("bengaluru");
        user.setPincode(560058);
        user.setPassword("123456");
        user.setConfirmPassword("123456");

        PlayStore playStore=new PlayStore();
        boolean isAdded =playStore.isUserAdded(user);
        if(isAdded==true){
            playStore.getInfoUser();
        }else{
            System.out.println("the details is not valid");
        }
    }
}
