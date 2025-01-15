package com.callableStatement.Scanner.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1: Load the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish the JDBC Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prepared_statement", "root", "root");

        // Step 3: Create a CallableStatement for the stored procedure
        CallableStatement cs = con.prepareCall("{call selecttData(?,?,?,?)}");
                ResultSet rs = cs.executeQuery();
                while(rs.next()) {
                	System.out.println(rs.getInt(1));
                	System.out.println(rs.getString(2));
                	System.out.println(rs.getString(3));
                	System.out.println(rs.getString(4));	
                }
        System.out.println("save data");
	}

}
