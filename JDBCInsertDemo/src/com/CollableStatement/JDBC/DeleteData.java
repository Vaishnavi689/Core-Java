package com.CollableStatement.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 1: Load the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Step 2: Establish the JDBC Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prepared_statement", "root", "root");
        
        // Step 3: Create a CallableStatement for the delete procedure
        CallableStatement cs = con.prepareCall("{call deleteData(?)}");
        
        // Step 4: Set the parameter for the delete procedure 
        cs.setInt(1, 10);  
        
        // Step 5: Execute the delete procedure
        int result = cs.executeUpdate();
        
        // Step 6: Check if data is deleted
        

        // Step 7: Close resources
        cs.close();
        con.close();
    }
}
