package AdvancedJAVA_NEW;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {

    //common code across programs is written in util -> util means utilities , you can utilise if needed
    public static Connection getJdbcConnection() throws SQLException, IOException {
        //2)Establish the connection
        // get the data from properties file
        FileInputStream fis =new FileInputStream("R:\\IntelliJ Idea Projects\\IneuronPractice\\src\\main\\java\\AdvancedJAVA_NEW\\application.properties");
        Properties properties = new Properties();
        properties.load(fis);

        String url = properties.getProperty("url");
        String userName = properties.getProperty("userName");
        String password =properties.getProperty("password");
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
