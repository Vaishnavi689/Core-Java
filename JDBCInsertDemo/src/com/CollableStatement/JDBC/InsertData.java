package com.CollableStatement.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			//step:1
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step:2
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prepared_statement","root","root");
			
			//step:3
			
			CallableStatement cs = con.prepareCall("{call insertData(?,?,?,?)}");
			                  cs.setInt(1, 50);
			                  cs.setString(2, "jasleen");
			                  cs.setString(3, "j@gmail.com");
			                  cs.setString(4, "Panjab");
			                  cs.execute();
			                  System.out.println("save data");
			                  
			                  
			con.close();
			cs.close();
			
			
			
			
		
		
	}

}
