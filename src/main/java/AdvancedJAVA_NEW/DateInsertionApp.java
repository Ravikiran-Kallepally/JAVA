package AdvancedJAVA_NEW;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DateInsertionApp {
    public static void main(String[] args){
        Connection connection =null;
        PreparedStatement pstmt =null;
        ResultSet resultSet =null;
        //1) load and register the driver -> done automatically JDBC 4.X
        //2) Establish the connection and recollect the flow
        try{
            connection= JDBCUtil.getJdbcConnection();
            System.out.println("Connection Established successfully");
            String sqlDateQuery = "UPDATE student SET enrollment_date = ? WHERE sname = ?;\n";
            if(connection!=null){
               pstmt= connection.prepareStatement(sqlDateQuery);
            }
            if(pstmt!=null){
                //capture the input
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the name of the student");
                String sname =scanner.next();
                System.out.println("Please enter the date in format yyyy-MM-dd");
                String enrollment_date =scanner.next();
                System.out.println(sqlDateQuery);
                //execute the query
                pstmt.setString(1,enrollment_date);
                pstmt.setString(2,sname);
                int rowCount = pstmt.executeUpdate();
                System.out.println("No of rows affected are :"+rowCount);
            }

        }catch (IOException ie){
            ie.printStackTrace();
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                JDBCUtil.cleanUp(connection, pstmt, null);
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
    }
}
