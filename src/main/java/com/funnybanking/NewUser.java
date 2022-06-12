package com.funnybanking;

public class NewUser {
    private static User NewUser = null;

    public static void createUser(String anrede, String firstname, String lastname, String email, String dateOfBirth, String street, int streetnumber, String zipcode,String city){
        NewUser = new User(anrede,firstname, lastname,  email, dateOfBirth,  street, streetnumber,zipcode, city);
    }

    public static User getUser(){
        return NewUser;
    }
}
