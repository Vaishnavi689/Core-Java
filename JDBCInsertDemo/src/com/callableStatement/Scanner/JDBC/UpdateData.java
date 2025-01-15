package com.callableStatement.Scanner.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 // Step 1: Load the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish the JDBC Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prepared_statement", "root", "root");

        // Step 3: Create a CallableStatement for the stored procedure
        CallableStatement cs = con.prepareCall("{call updatetData(?,?,?,?)}");

        // Step 4: Set the parameters dynamically
        cs.setString(1, "Deepali");      // Name
        cs.setString(2, "dv@gmail.com"); // Email
        cs.setString(3, "jalgaon");      // Address
        cs.setInt(4, 2);                 // Roll Number (Condition for update)

        // Step 5: Execute the stored procedure
        int update = cs.executeUpdate();
	    System.out.println("Update data"+ update);
	    System.out.println("save data");
	}

}
