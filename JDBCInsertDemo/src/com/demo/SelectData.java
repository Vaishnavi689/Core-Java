package com.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {
    public void selectData() throws ClassNotFoundException, SQLException {
        // Step 1: Load Driver class
       // Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish JDBC connection
        //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");

        // Step 3: Create SQL query for SELECT operation
        String sql = "SELECT rollno, name, gender, addr FROM student_table";

        // Step 4: Create SQL statement object
        Statement smt = JDBC_Connection.getConnection().createStatement();

        // Step 5: Execute the query
        ResultSet rs = smt.executeQuery(sql);

        // Step 6: Process and display the results
        System.out.println("Fetching data from student_table:");
        while (rs.next()) {
            System.out.println("Roll No: " + rs.getInt("rollno"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Gender: " + rs.getString("gender"));
            System.out.println("Address: " + rs.getString("addr"));
            System.out.println("-------------------------");
        }

        // Step 7: Close resources
        rs.close();
        smt.close();
        //con.close();
    }
}
