package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step-1: load driver class
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// step-2:Establish jdbc connection
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
				// step-3: create sql query
				String sql="select * from register";
				//String sql1="delete from register where name=vaishnavi";
				 //step-4: create sql statement obj
				 Statement smt=  con.createStatement();
				 ResultSet rs=smt.executeQuery(sql);
				 System.out.println("Selected Data:");
				 while(rs.next()){
					 
					System.out.println(rs.getString(1));
				System.out.println(rs.getString(2)); 
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
					System.out.println(rs.getString(5));
					
				 }
				 
				
				 //step-5 submit sql query
				 //smt.execute(sql);
				 //step-6 close all sql query
				 con.close();
				 smt.close();

	}

}
