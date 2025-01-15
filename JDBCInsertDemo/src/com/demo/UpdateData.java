package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public  void  UpdateData() throws ClassNotFoundException, SQLException {
//        // Step 1: Load Driver class
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        // Step 2: Establish JDBC connection
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");

        // Step 3: Create SQL query for UPDATE operation
        String sql = "UPDATE student_table SET name = 'jasleen', gender = 'female', addr = 'panjab' " +
                     "WHERE rollno = 11";

        // Step 4: Create SQL statement object
        Statement smt = JDBC_Connection.getConnection().createStatement();

        // Step 5: Execute the query
        int rowsUpdated = smt.executeUpdate(sql);

        System.out.println("Update data");
        

        // Step 7: Close resources
        smt.close();
        //con.close();
    }
}
