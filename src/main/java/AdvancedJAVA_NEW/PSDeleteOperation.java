package AdvancedJAVA_NEW;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PSDeleteOperation {
    //Prepared statement delete operation
    public static void main(String[] args){
        Connection connection = null;
        PreparedStatement pstmt = null;
        Scanner scanner = null;
        //1)Load and register the driver -> done automatically from JDBC 4.X
        //2) Establish the connection
        try{
             connection =JDBCUtil.getJdbcConnection();
            String sqlDeleteQuery = "DELETE FROM student WHERE sname = ?;\n";

            //3) create a statement object and execute the query
            if(connection!=null){
                pstmt = connection.prepareStatement(sqlDeleteQuery);
            }
            if(pstmt!=null){
                scanner = new Scanner(System.in);
                System.out.println("Please enter the name of the record to be deleted");
                //capture the input string
                String sname =scanner.next();
                System.out.println(sqlDeleteQuery);

                //execute the query
                pstmt.setString(1,sname);
                int rowCount = pstmt.executeUpdate();
                System.out.println("No of rows affected are : "+rowCount);
            }
        }catch (SQLException se){
            se.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //closing the resources
            try{
                JDBCUtil.cleanUp(connection,pstmt,null);
            }catch (SQLException se){
                se.printStackTrace();
            }

        }

    }
}
