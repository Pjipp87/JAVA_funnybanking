package com.funnybanking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class UserDBController {
    static Connection con;
    static Statement stm;

    public static void connectToTB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println();
        }
    }
}

