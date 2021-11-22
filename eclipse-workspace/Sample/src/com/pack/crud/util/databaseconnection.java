package com.pack.crud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 

public class databaseconnection {
    private static Connection con = null;
      
    static
    {
        String url = "jdbc:mysql:// localhost:3306/emp";
        String user = "root";
        String pass = "root123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            
            if(con != null){
 			   System.out.println("Successfully connected.");
 			}else{
 			   System.out.println("Failed to connect.");
 			}
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
}
