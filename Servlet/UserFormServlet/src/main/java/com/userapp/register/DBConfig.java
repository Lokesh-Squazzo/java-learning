package com.userapp.register;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
    private final static String user= "root";
    private final static String password= "Lokesh@2023";
    private final static String dbname= "user_register";
    private final static String url= "jdbc:mysql://localhost:3306/"+dbname;

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
