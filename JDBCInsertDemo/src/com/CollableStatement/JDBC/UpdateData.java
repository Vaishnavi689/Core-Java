package com.CollableStatement.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//step:1
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step:2
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prepared_statement","root","root");
		
		//step:3
		
		CallableStatement cs = con.prepareCall("{call updateData(,?,?,?)}");
		                  
		                  cs.setString(1, "Deepali");
		                  cs.setString(2, "dw@gmail.com");
		                  cs.setString(3, "Panjab");
		                  cs.setInt(4, 200);
		                  int update=cs.executeUpdate();
		                  System.out.println("save data");
		                  
		                  
		                  
		con.close();
		cs.close();
	}
	

}
