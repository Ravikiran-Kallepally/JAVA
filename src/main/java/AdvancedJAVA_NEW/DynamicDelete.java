package AdvancedJAVA_NEW;

import java.sql.*;
import java.util.Scanner;

public class DynamicDelete {
    public static void main(String[] args){

        try{
            //1)Load and register the driver -> Auto loading is enabled from JDBC 4.X
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
            //2)Establish the connection
            String url ="jdbc:mysql:///student";
            String userName ="root";
            String password ="123456";
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection established successfully");
            //3)Create a statement object and send the query
            Statement statement = connection.createStatement();
            System.out.println("Statement object created");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the student to be deleted ");
            String sname = scanner.next();
            //4)Execute the query and process the result set
            String sqlDynamicDeleteQuery = String.format("delete from student where sname='%s' ",sname);
            int rowsAffected = statement.executeUpdate(sqlDynamicDeleteQuery);
            System.out.println("Number of rowsAffected are : "+rowsAffected);
            //6)Close all the resources

            statement.close();
            connection.close();
            System.out.println("Closing all the resources");

            //5)Handle SQL/other exceptions
        }catch (ClassNotFoundException ce){
            ce.printStackTrace();
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }






    }
}
