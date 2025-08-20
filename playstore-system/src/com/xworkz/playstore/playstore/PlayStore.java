package com.xworkz.playstore.playstore;

import com.xworkz.playstore.user.User;
import com.xworkz.playstore.uservalidator.Validator;

public class PlayStore {
    User user1;
    public boolean isUserAdded(User user1){
      boolean  isUserAdded=false;

        Validator validator=new Validator();
        boolean isinfoValid=validator.isInfoValid(user1);

        if(isinfoValid==true){
            this.user1=user1;
            isUserAdded=true;
        }else{
            System.out.println("the info provided by user is not valid");
        }
        return isUserAdded;
    }
    public void getInfoUser(){
        System.out.println("the id of the user is  "+user1.getUserId());
        System.out.println("the firstname of the user is  "+user1.getFirstName());
        System.out.println("the last name of the user is  "+user1.getLastName());
        System.out.println("the dob of the user is  "+user1.getDob());
        System.out.println("the gender of the user is  "+user1.getGender());
        System.out.println("the age of the user is  "+user1.getAge());
        System.out.println("the phone number of the user is  "+user1.getPhoneNumber());
        System.out.println("the email of the user is  "+user1.getEmail());
        System.out.println("the address of the user is  "+user1.getAddress());
        System.out.println("the country of the user is  "+user1.getCountry());
        System.out.println("the state of the user is  "+user1.getState());
        System.out.println("the city of the user is  "+user1.getCity());
        System.out.println("the pincode of the user is  "+user1.getPincode());
        System.out.println("the password of the user is  "+user1.getPassword());
        System.out.println("the cpassword of the user is  "+user1.getConfirmPassword());












    }
}
