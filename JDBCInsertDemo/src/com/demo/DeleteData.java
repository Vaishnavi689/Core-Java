package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
	public  void  DeleteData() throws ClassNotFoundException, SQLException {
//		// Step 1: Load Driver class
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		// Step 2: Establish JDBC connection
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");

		// Step 3: Create SQL query for DELETE operation
		String sql = "DELETE FROM student_table WHERE rollno = 10"; // Delete data with rollno = 10

		// Step 4: Create SQL statement object
		Statement smt = JDBC_Connection.getConnection().createStatement();

		// Step 5: Execute the query
		int rowsDeleted = smt.executeUpdate(sql);
System.out.println("Delete Data:");
		// Step 7: Close resources
		smt.close();
		//con.close();
	}
}
