package com.mavenday1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteRecord {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    String url = "jdbc:mysql://localhost:3306/MavanJDBC";
	    String username = "root";
	    String password = "root";

	   
	        Connection con = DriverManager.getConnection(url, username, password);

	        Statement ps= con.createStatement();

	        String sql = "Delete from Student where id=1 ";
	        
	       

	        ps.executeUpdate(sql);

	        System.out.println("table record delete successfully");

	        ps.close();
	        con.close();

	    } 

}
