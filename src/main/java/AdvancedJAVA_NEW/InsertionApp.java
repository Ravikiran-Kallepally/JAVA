package AdvancedJAVA_NEW;

import java.sql.*;

public class InsertionApp {
    public static void main(String[] args){
        Connection connection =null;
        Statement statement =null;
        ResultSet resultSet =null;
        try{
            //1)Load and register the driver -> Auto loading is enabled from JDBC 4.X

            //2)Establish the connection
            connection=JDBCUtil.getJdbcConnection();
            if(connection!=null){
                statement =connection.createStatement();
            }
            if(statement!=null){
                resultSet =statement.executeQuery("select sid,sname,sage,saddress,sgender from student");
            }
            if(resultSet!=null){
                System.out.println("SID\tSNAME\tSAGE\tSADDRESS\tSGENDER");
                while(resultSet.next()){
                    int sid = resultSet.getInt(1);
                    String sname = resultSet.getString(2);
                    int sage = resultSet.getInt(3);
                    String saddress = resultSet.getString(4);
                    String sgender = resultSet.getString(5);
                    System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddress+"\t"+sgender);

                }
            }
            //5)Handle SQL/other exceptions
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                JDBCUtil.cleanUp(connection,statement,resultSet);
                System.out.println("Closing all the resources");

            }catch (SQLException se){
                se.printStackTrace();
            }

        }






    }
}
