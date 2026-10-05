package com.mavenday1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValues {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/MavanJDBC";
		String urname="root";
		String pw="root";
		
		Connection con=DriverManager.getConnection(url,urname,pw);
		String sql="insert into Student values(?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 1);
		ps.setString(2, "vaishnavi");
		ps.setInt(3, 12);
		ps.setString(4, "pune");
		

		
		int no=ps.executeUpdate();
	 
			System.out.println("insert records "+no);
			
			con.close();
			ps.close();
			
	}

}
