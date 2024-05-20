package AdvancedJAVA_NEW;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PSInsertOperation {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        PreparedStatement pstmt = null;
        Scanner scanner = null;
        //1)load and register the driver -> done automatically from JDBC 4.X

        //2) Establish the connection
        try {
            connection = JDBCUtil.getJdbcConnection();
            //3) create a statement object and send the query
            String sqlInsertQuery = "insert into student(`sname`,`sage`,`saddress`,`sgender`)values(?,?,?,?)";
            if (connection != null) {
                pstmt = connection.prepareStatement(sqlInsertQuery);
            }
            if (connection != null) {
                scanner = new Scanner(System.in);
                System.out.println("Please enter the name of the student");
                String sname = scanner.next();
                System.out.println("Please enter the age of the student");
                int sage = scanner.nextInt();
                System.out.println("Please enter the address of the student");
                String saddress = scanner.next();
                System.out.println("Please enter the gender of the student");
                String sgender = scanner.next();
                //use pre-compiled query to set the values
                pstmt.setString(1, sname);
                pstmt.setInt(2, sage);
                pstmt.setString(3, saddress);
                pstmt.setString(4, sgender);

                System.out.println(sqlInsertQuery);
                //execute the query
                int rowCount = pstmt.executeUpdate();
                System.out.println("No of rows updated " + rowCount);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtil.cleanUp(connection, pstmt, null);
                scanner.close();
                System.out.println("Closing the resource...");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
