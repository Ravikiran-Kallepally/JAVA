package com.ineuron.AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
    public static void main(String[] args){
        // 1) Load and register the driver -> Automated from JDBC 4.X
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2) Establish the connection
            String userName = "root";
            String password = "123456";
            String URL = "jdbc:mysql:///demodb";
            Connection connection = DriverManager.getConnection(URL, userName, password);
            // 3) create statement object and send the query
            Statement statement = connection.createStatement();
            // 4) Execute the query and process the result set
            String sqlInsertQuery = "INSERT INTO MyTable (id, name) VALUES (5, 'Emily');";
            int rowsAffected = statement.executeUpdate(sqlInsertQuery);
            System.out.println("No of rows affected is : "+ rowsAffected);
            //ResultSet resultSet = statement.executeQuery(sqlDeleteQuery);
            // 5) handle all the exceptions -> catch block
            // 6) close all the resources
            // resultSet.close();
            statement.close();
            connection.close();
        }catch (Exception ce){
            ce.printStackTrace();
        }
    }
    }
