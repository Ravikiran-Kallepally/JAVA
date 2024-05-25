package AdvancedJAVA_NEW;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * @author nitin
 * @version JDK1.8 Company : www.ineuron.ai
 */
public class JdbcUpdatableResultSet {

    public static void main(String[] args) {

        // Resources used
        Connection connection = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtil.getJdbcConnection();

            if (connection != null)
                // Expecting ResultSet to be SCROLLABLE AND UPDATABLE
                stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sqlQuery = "select sid,sname,sage,saddress,salary from student";

            if (stmt != null)
                resultSet = stmt.executeQuery(sqlQuery);

            if (resultSet != null) {
                System.out.println("Records before updation....");
                System.out.println("ID\tNAME\tAGE\tADDRESS\tSALARY");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
                            + "\t" + resultSet.getString(4) + "\t" + resultSet.getInt(5));
                }

                //performing update operation
                resultSet.beforeFirst();
                while (resultSet.next()) {
                    int originalSalary = resultSet.getInt(5);
                    if (originalSalary < 5000) {
                        int incrSalary = originalSalary + 1000;
                        resultSet.updateInt(5, incrSalary);
                        resultSet.updateRow();

                    }
                }

                System.out.println();
                resultSet.beforeFirst();// taking the cursor to BFR
                System.out.println("Records after updation....");
                System.out.println("ID\tNAME\tAGE\tADDRESS");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
                            + "\t" + resultSet.getString(4) + "\t" + resultSet.getInt(5));
                }
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                JDBCUtil.cleanUp(connection, stmt, resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
