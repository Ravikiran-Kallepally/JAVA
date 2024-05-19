package AdvancedJAVA_NEW;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicUpdate {
    public static void main(String[] args){
        //1) Load and register the driver -> Auto from JDBC 4.0
        try{
            //2) Establish the connection
            String url ="jdbc:mysql:///student";
            String userName ="root";
            String password ="123456";
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection established successfully");
            //3) create a statement object and execute the query
            Statement statement = connection.createStatement();
            System.out.println("Statement object created successfully");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the name");
            scanner.next();
            System.out.println("Please enter the location");
            scanner.next();
            //4) process the result set
            String sqlUpdateQuery = "UPDATE student SET sname = ?, saddress = ? WHERE sid = 1";
            ResultSet resultSet = statement.executeQuery(sqlUpdateQuery);
            while(resultSet.next()){
                String sname = resultSet.getString("name");
                String slocation = resultSet.getString(("address"));
                System.out.println("Details :"+sname +" "+ slocation);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
