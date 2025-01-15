package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {
	public static Connection  getConnection()throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 // Step 1: Load Driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish JDBC connection
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
       
       
	}

	

}
