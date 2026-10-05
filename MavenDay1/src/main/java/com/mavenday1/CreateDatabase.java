package com.mavenday1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CreateDatabase {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306";
    String username = "root";
    String password = "root";

   
        Connection con = DriverManager.getConnection(url, username, password);

        //Statement st = con.createStatement();

        String sql = "CREATE DATABASE MavanJDBC";
        
        PreparedStatement ps=  con.prepareStatement(sql);

        ps.execute(sql);

        System.out.println("Database created successfully");

        ps.close();
        con.close();

    } 

}
