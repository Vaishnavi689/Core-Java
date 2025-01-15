package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) throws Exception {
        // Step 1: Load Driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish JDBC connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");

        // Step 3: Create SQL query
        String str = "INSERT INTO register (name, email, password, gender, city) " +
                     "VALUES ('vaishnavi', 'vaish@gmail.com', 'root', 'female', 'pune')";

        // Step 4: Create SQL statement object
        Statement smt = con.createStatement();

        // Step 5: Execute the query
        smt.executeUpdate(str);

        // Step 6: Print success message
        System.out.println("Data inserted successfully.");

        // Step 7: Close resources
        smt.close();
        con.close();
    }
}
