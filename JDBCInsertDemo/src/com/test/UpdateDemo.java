package com.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 1: Load the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish JDBC connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");

        // Step 3: Create the SQL query
        String sql = "UPDATE register SET name='Sakshi' WHERE city='pune'"; 

        // Step 4: Create a SQL Statement object
        Statement smt = con.createStatement();

        // Step 5: Execute the update query
        int update = smt.executeUpdate(sql);

        // Step 6: Display the number of rows updated
        System.out.println("Rows updated: " + update);

        // Step 7: Close the statement and connection
        smt.close();
        con.close();
    }
}
