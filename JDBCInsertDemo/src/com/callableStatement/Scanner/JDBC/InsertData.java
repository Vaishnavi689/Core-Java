package com.callableStatement.Scanner.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prepared_statement", "root", "root");
	
		  // Step 3: Create Scanner for user input
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Roll Number: ");
	        int rollno = sc.nextInt();

	        System.out.print("Enter Name: ");
	        String name = sc.next();

	        System.out.print("Enter Email: ");
	        String email = sc.next();

	        System.out.print("Enter Address: ");
	        String addr = sc.next();

	        // Step 4: Create a CallableStatement for the stored procedure
	        CallableStatement cs = con.prepareCall("{call insertData(?,?,?,?)}");

	        // Step 5: Set the parameters dynamically
	        cs.setInt(1, rollno);
	        cs.setString(2, name);
	        cs.setString(3, email);
	        cs.setString(4, addr);

	        // Step 6: Execute the stored procedure
	        int result = cs.executeUpdate();

	        
	
	
	
	
	}

}
