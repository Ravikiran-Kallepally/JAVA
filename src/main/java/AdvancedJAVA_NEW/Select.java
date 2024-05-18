package AdvancedJAVA_NEW;

import java.sql.*;

//program to demonstrate select operation using JDBC
public class Select {
    public static void main(String[] args){
    //since auto loading is enabled from JDBC 4.X , we can skip step 1 that is loading and registering the driver

        try{
            // 2) Establish the connection
            String url = "jdbc:mysql:///student";
            String userName ="root";
            String password ="123456";
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("CONNECTION established successfully");

            //3) create a statement object and send the query
            Statement statement = connection.createStatement();
            System.out.println("STATEMENT object is created");

            //4) Execute the query and process the result set
            String sqlSelectQuery = "select sid,sname,sage,saddress from student";
            ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
            System.out.println("RESULTSET object created...");
            System.out.println("SID\tSNAME\tSAGE\tSADDRESS");

            while(resultSet.next()){
                Integer sid = resultSet.getInt("sid");
                String sname = resultSet.getString("sname");
                Integer sage = resultSet.getInt("sage");
                String saddress = resultSet.getString("saddress");
                System.out.println(sid + "\t" + sname + "\t" + sage + "\t" +saddress);
            }
            //close all the resources
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Closing the resources...");

        }catch (SQLException se ){
            se.printStackTrace();
        }




    }
}
