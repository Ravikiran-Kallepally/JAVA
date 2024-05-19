package AdvancedJAVA_NEW;

import java.sql.*;

public class JDBCUtil {

    //common code across programs is written in util -> util means utilities , you can utilise if needed
    public static Connection getJdbcConnection() throws SQLException {
        //2)Establish the connection
        String url ="jdbc:mysql:///student";
        String userName ="root";
        String password ="123456";
        Connection connection = DriverManager.getConnection(url,userName,password);
        System.out.println("Connection established successfully");
        return connection;
    }
    public static void cleanUp(Connection connection, Statement statement, ResultSet resultSet) throws SQLException{
        //6)Close all the resources
        if(connection!=null){
            connection.close();
        }
        if(statement!=null){
            statement.close();
        }
        if(resultSet!=null){
            resultSet.close();
        }
    }

}
