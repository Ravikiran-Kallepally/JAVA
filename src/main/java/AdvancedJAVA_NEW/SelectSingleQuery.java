package AdvancedJAVA_NEW;

import java.sql.*;

public class SelectSingleQuery {
    public static void main(String[] args){

        //1) Load and register the driver will be done automatically from JDBC 4.X

        //2) Establish the connection
        try{
            String url ="jdbc:mysql:///student";
            String userName ="root";
            String password ="123456";
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("CONNECTION established successfully");

            //3) create the statement object and execute the query
            Statement statement = connection.createStatement();
            System.out.println("STATEMENT object is created ");

            //4) Process the result set and execute the query
            String SQLQuery ="select sid,sname,sage,saddress from student where sid= 1";
            ResultSet resultSet = statement.executeQuery(SQLQuery);
            System.out.println("RESULTSET object created...");
            while(resultSet.next()){
                Integer sid = resultSet.getInt(1);
                String sname = resultSet.getString(2);
                Integer sage = resultSet.getInt(3);
                String saddress = resultSet.getString(4);
                System.out.println(sid + "\t" + sname + "\t" + sage + "\t" +saddress);
            }
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
