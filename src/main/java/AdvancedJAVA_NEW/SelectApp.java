package AdvancedJAVA_NEW;

import java.sql.*;

public class SelectApp {
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
            //4)Execute the query and process the result set
            String sqlQuery = "select sid,sname,sage,saddress from student";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            System.out.println("Result object created");
            System.out.println("SID\tSNAME\tSAGE\tSADDRESS");

            while(resultSet.next()){
                int sid = resultSet.getInt(1);
                String sname = resultSet.getString(2);
                int sage = resultSet.getInt(3);
                String saddress = resultSet.getString(4);
                System.out.println(sid + "\t"+ sname +"\t"+ sage+ "\t"+saddress);
            }
            //6)Close all the resources
            resultSet.close();
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
