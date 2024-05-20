package AdvancedJAVA_NEW;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PSSelectOperation {
    public static void main(String[] args) {
        Connection connection =null;
        PreparedStatement pstmt = null;
        Scanner scanner =null;
        ResultSet resultSet =null;
        //1) Load and register the driver -> done automatically from JDBC 4.X
        //2) Establish the connection
        try{
             connection =JDBCUtil.getJdbcConnection();
             String sqlQuery ="SELECT * FROM student WHERE sname = ?";
            if(connection!=null){
                pstmt = connection.prepareStatement(sqlQuery);
            }
            if(pstmt!=null){
                //take the input from the user

                scanner = new Scanner(System.in);
                System.out.println("Enter the name of the person to be displayed");
                String sname = scanner.next();
                //execute the query
               pstmt.setString(1,sname);
                //since it is a select statement,we have to use executeQuery
                resultSet = pstmt.executeQuery();
                while (resultSet.next()){
                    String name = resultSet.getString("sname");
                    int age = resultSet.getInt("sage");
                    String address = resultSet.getString("saddress");
                    String gender = resultSet.getString("sgender");

                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Address: " + address);
                    System.out.println("Gender: " + gender);
                }

            }

        }catch (IOException ie){
            ie.printStackTrace();
        }catch (SQLException se){
            se.printStackTrace();
        }finally {
            try{
                JDBCUtil.cleanUp(connection,pstmt,resultSet);
            }catch (SQLException se){
                se.printStackTrace();
            }

        }
        //3) create a statement object and send the query
        //4) Process the resultSet or int rowAffected and execute the query
        //5) Handle SQL/Generic exceptions
        //6) Close all the resources
    }
}
