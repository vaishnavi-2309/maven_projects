package com.mavenday1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable {

    public static void main(String[] args) throws Exception {

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/MavanJDBC";
        String username = "root";
        String password = "root";

        // Create connection
        Connection con = DriverManager.getConnection(url, username, password);

        // SQL query
        String sql = "CREATE TABLE Student (id INT, name VARCHAR(30), age INT, city VARCHAR(30))";

        // Prepare statement
        PreparedStatement ps = con.prepareStatement(sql);

        // Execute query
        ps.execute();

        System.out.println("Table Created");

        // Close resources
        ps.close();
        con.close();
    }
}