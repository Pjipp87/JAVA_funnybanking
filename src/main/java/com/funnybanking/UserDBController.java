package com.funnybanking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;


public class UserDBController {
    static Connection con;
    static Statement stm;

    public static void connectToDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lionsbank","root","");
            stm = con.createStatement();
            //String sql_create = "CREATE TABLE IF NOT EXISTS Benutzerdatenbank(personalnummer INTEGER, anrede VARCHAR(50), firstname VARCHAR(50), lastname VARCHAR(50), password VARCHAR(50), loggedIn BOOLEAN);";
            //stm.execute(sql_create);
            System.out.println("Datenbankverbindung hergestellt");

        } catch (Exception e) {
            System.out.println("Es konnte keine Verbindung zur Datenbank hergestellt werden!");
            System.out.println(e);
        }
    }

    public static boolean checkForExistingUser(String firstname, String lastname, String username){
        boolean exists= true;
        boolean personExists = true;
        boolean usernameExists = true;
        try {            
            String sql_select_firstname = "SELECT * FROM usersdb WHERE firstname='"+firstname+"' AND lastname='"+lastname+"'";
            ResultSet rs_firstname = stm.executeQuery(sql_select_firstname);        

            if(rs_firstname.next()){
                personExists = true;
            }else{
                personExists = false;
            }
        } catch (Exception e) {
            System.out.println("Fehler in der checkForExistingUser Methode - personExists");
        }
        try {
            String sql_select_firstname = "SELECT * FROM usersdb WHERE username='"+username+"'";
            ResultSet rs_firstname = stm.executeQuery(sql_select_firstname);        

            if(rs_firstname.next()){
                personExists = true;
            }else{
                personExists = false;
            }
        } catch (Exception e) {
            System.out.println("Fehler in der checkForExistingUser Methode - usernameExists");
        }

        if (personExists && usernameExists) {
            exists = true;
        } else {
            exists = false;
        }
        return exists;
    }

    public static void addUser(String title,String firstname,String lastname,String dateOfBirth,int age, String phone,String street,int streetnumber, String postcode,String city,String email,String username,String md5,String regdate, double balance,String imgbig,String imgsmall,String imgthumbnail){
        if(true){
            try {
                String sql_insert = "INSERT INTO usersdb(title, firstname, lastname, dateOfBirth, age, phone, street, streetnumber, postcode, city, email, username, md5, regdate, balance, imgbig, imgsmall, imgthumbnail) VALUES('"+title+"', '"+firstname+"', '"+lastname+"', '"+dateOfBirth+"', '"+age+"', '"+phone+"', '"+street+"', '"+streetnumber+"', '"+postcode+"', '"+city+"', '"+email+"', '"+username+"', '"+md5+"', '"+regdate+"', '"+balance+"', '"+imgbig+"', '"+imgsmall+"', '"+imgthumbnail+"')";
             stm.execute(sql_insert);

            
            } catch (Exception e) {
                System.out.println("Fehler in addUser - Methode");
                System.out.println(e);
            }
        }else{
           System.out.println("addUser Bedinung nicht erfüllt");
        }
        // "INSERT INTO UsersDB (title, firstname, lastname, dateOfBirth, age, phone, street, streetnumber, postcode, city, email, username, md5, regdate, balance, imgbig, imgsmall, imgthumbnail) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s,  %s, %s, %s)"
    
       
    }
}

