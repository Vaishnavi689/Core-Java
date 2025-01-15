package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
    public  void InsertData() throws Exception {
//        // Step 1: Load Driver class
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        // Step 2: Establish JDBC connection
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");

        // Step 3: Create SQL query
        String sql = "insert into student_table (rollno, name, gender, addr) values(19, 'sakshi', 'female', 'Buldhana')";

       
        
		// Step 4: Create SQL statement object
        Statement smt = JDBC_Connection.getConnection().createStatement();

        // Step 5: Execute the query
         smt.execute(sql); // Use executeUpdate for DML statements

        // Step 6: Print success message
        System.out.println("Rows inserted:");

        // Step 7: Close resources
        smt.close();
        //con.close();
    }
}
