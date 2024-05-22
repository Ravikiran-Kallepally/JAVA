package AdvancedJAVA_NEW;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BlobInsertionPractice {
    public static void main(String[] args) {
        //Resources used
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        Scanner scanner = null;
        //variables used -> what are you capturing
        String name = null;
        String videoLoc = null;
        //storing video in to database
        //1) Load and register the driver done automatically from JDBC 4.X
        //2) Establish the connection
        {
            try {
                connection = JDBCUtil.getJdbcConnection();
                String sqlQuery = "insert in to humans (`name`,`video`) values(?,?)";
                if (connection != null) {
                    pstmt = connection.prepareStatement(sqlQuery);
                }
                if (pstmt != null) {

                        scanner = new Scanner(System.in);
                        System.out.println("Enter the name of the human");
                        name = scanner.next();
                        System.out.println("Enter the path of the video");
                        videoLoc = scanner.next();
                        //set the values for prepared statement
                        pstmt.setString(1, name);
                        pstmt.setBinaryStream(2, new FileInputStream(new File(videoLoc)));
                        //execute the query
                        int rowsAffected = pstmt.executeUpdate();
                        System.out.println("No of rows affected are : " + rowsAffected);


                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    JDBCUtil.cleanUp(connection, pstmt, null);
                } catch (SQLException se) {
                    se.printStackTrace();
                }
                //scanner.close();

            }

        }
    }
}
