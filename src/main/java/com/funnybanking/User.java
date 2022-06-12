package com.funnybanking;

public class User {
    
    private String anrede;
    private String firstname;
    private String lastname;
    private String email;
    private String dateOfBirth;
    private String street;
    private int streetnumber;
    private String zipcode;
    private String city;
    private String username;
    private String passwordHash;


    public User(String anrede, String firstname, String lastname, String email, String dateOfBirth, String street, int streetnumber, String zipcode,String city){
        this.anrede = anrede;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.street = street;
        this.streetnumber = streetnumber;
        this.zipcode = zipcode;
        this.city = city;
    }

    public void setAnrede(String anrede){
        this.anrede = anrede;
    }

    public String getAnrede(){
        return this.anrede;
    }
    
    public void setfirstname(String firstname){
        this.firstname = firstname;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getLastname(){
        return this.lastname;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setDateOfBirth(String dob){
        this.dateOfBirth = dob;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getStreet(){
        return this.street;
    }

    public void setStreetNumber(int streetNumber){
        this.streetnumber = streetNumber;
    }

    public int getStreetNumber(){
        return this.streetnumber;
    }

    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }

    public String getZipCode(){
        return this.zipcode;
    }


    public void setcity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }


    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setPasswordHash(String passwordHash){
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash(){
        return this.passwordHash;
    }


}
