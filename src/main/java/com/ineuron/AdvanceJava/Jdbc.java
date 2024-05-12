package com.ineuron.AdvanceJava;

import java.sql.*;

public class Jdbc {
    public  static void main(String[] args){
        //1) Load and register the driver
        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");
        //2) Establish the connection
            String userName ="root";
            String password ="123456";
            String url ="jdbc:mysql:///demodb";
           Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("CONNECTION object created...");
// Step3. Create statement Object and send the Query
            Statement statement = connection.createStatement();
            System.out.println("STATEMENT object created...");
// Step4. Execute the Query and Process the resultSet
            String sqlSelectQuery = "SELECT * FROM employee;";
            ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
            System.out.println("RESULTSET object created...");
            System.out.println("firstName\tlastName\temail\tphone\thiredate\tdepartment id ");
            while (resultSet.next()) {
                String firstName  = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                Date date = resultSet.getDate("hire_date");
                int id = resultSet.getInt("department_id");
                System.out.println(firstName + "\t" + lastName + "\t" + email + "\t" +
                        phone + "\t" + date + "\t" + id);
            }
// Step6. Close the resources
            resultSet.close();
            statement.close();
            connection.close();
            System.exit(0);
        }catch (Exception ce){ //step 5 => if exception , handle it using exception handlers
            ce.printStackTrace();
        }
    }
}
