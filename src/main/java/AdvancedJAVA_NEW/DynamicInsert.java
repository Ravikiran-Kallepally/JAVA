package AdvancedJAVA_NEW;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInsert {
    public static void main(String[] args){
        //1) Load and register the driver -> done automatically from JDBC 4.X
        try {
            // 2)Establish the connection
            String url ="jdbc:mysql:///student";
            String userName ="root";
            String password = "123456";
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection established successfully");
            // 3)Create the statement object and execute the query
            Statement statement = connection.createStatement();
            System.out.println("Statement object is created");
            //Take the input from the user
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the name of the student");
            String sname = scan.next();
            System.out.println("Enter the age of the student ");
            int sage = scan.nextInt();
            System.out.println("Enter the address of the student");
            String saddress = scan.next();
            System.out.println("Enter the gender of the student");
            String sgender = scan.next();
            //4)Process the result set
            String sqlInsertQuery = String.format("insert into student(`sname`,`sage`,`saddress`,`sgender`) values ('%s',%d,'%s','%s')", sname, sage, saddress,sgender);
            System.out.println(sqlInsertQuery);
            int rowAffected = statement.executeUpdate(sqlInsertQuery);
            System.out.println("No of rows affected is :: " + rowAffected);

            //close all the resources
            statement.close();
            connection.close();
            scan.close();
        }catch (SQLException se){
            se.printStackTrace();
        }

    }
}
