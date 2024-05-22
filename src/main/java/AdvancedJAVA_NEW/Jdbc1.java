package AdvancedJAVA_NEW;
import java.sql.*;
public class Jdbc1 {
    public static void main(String[] args){
        System.out.println("Jan 11th basic DB connection");
        //Steps given by sun micro systems to communicate with the database
        Connection connection =null;
        Statement statement = null;
        ResultSet resultSet =null;

        try{
            //1)Load and register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");

            //2) Establish the connection with the database
            String url = "jdbc:mysql:///student";
            String userName = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection established successfully");
            System.out.println("The implemented class name is "+connection.getClass().getName());

            //3) create a statement object,send and execute the query
            String sqlSelectQuery = "select sid,sname,sage,saddress from student";
            //creating a statement object below
            statement = connection.createStatement();
            System.out.println("The implementation class name is "+ statement.getClass().getName());
            // executing the query below
            resultSet = statement.executeQuery(sqlSelectQuery);
            System.out.println("The implementation class for the result set is "+resultSet.getClass().getName());
            System.out.println();
            System.out.println("SID\tSNAME\tSAGE\tSADDRESS");

            //4) Process the resultSet
            while (resultSet.next()){
                Integer sid = resultSet.getInt(1);
                String sname = resultSet.getString(2);
                Integer sage = resultSet.getInt(3);
                String saddress = resultSet.getString(4);
                System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddress);
            }


            //5) Handle SQL exceptions if it gets generated
        }catch (ClassNotFoundException ce){
            ce.printStackTrace();
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        //6) close the resources
        finally {
            //closing the resources
            if(connection!=null){
                try{
                connection.close();
                System.out.println("Connection closed ");
                }catch (SQLException se){
                se.printStackTrace();
                }

            }
        }
    }
}
