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
            String sql_create = "CREATE TABLE IF NOT EXISTS Benutzerdatenbank(personalnummer INTEGER, anrede VARCHAR(50), firstname VARCHAR(50), lastname VARCHAR(50), password VARCHAR(50), loggedIn BOOLEAN);";
            stm.execute(sql_create);
            System.out.println("Datenbankverbindung hergestellt");

        } catch (Exception e) {
            System.out.println("Es konnte keine Verbindung zur Datenbank hergestellt werden!");
            System.out.println(e);
        }
    }
}

