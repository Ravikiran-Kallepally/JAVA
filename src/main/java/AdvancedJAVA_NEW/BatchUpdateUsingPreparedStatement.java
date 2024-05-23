package AdvancedJAVA_NEW;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BatchUpdateUsingPreparedStatement {

    public static void main(String[] args) {

        // Resources used
        Connection connection = null;
        PreparedStatement pstmt = null;
        Scanner scanner = null;

        try {
            connection = JDBCUtil.getJdbcConnection();

            String sqlInsertQuery = "INSERT INTO friends(`name`, `age`, `address`) VALUES (?, ?, ?)";
            if (connection != null)
                pstmt = connection.prepareStatement(sqlInsertQuery);

            if (pstmt != null) {
                scanner = new Scanner(System.in);

                while (true) {
                    try {
                        System.out.print("Enter the name :: ");
                        String name = scanner.next();

                        System.out.print("Enter the age:: ");
                        int age = scanner.nextInt();

                        scanner.nextLine(); // Consume the newline character left by nextInt()

                        System.out.print("Enter the address :: ");
                        String address = scanner.nextLine();

                        pstmt.setString(1, name);
                        pstmt.setInt(2, age);
                        pstmt.setString(3, address);

                        // Query added to batch file
                        pstmt.addBatch();

                        System.out.print("Do you want to insert one more record [YES/NO]:: ");
                        String option = scanner.next();

                        if (option.equalsIgnoreCase("no")) {
                            break;
                        }
                    } catch (InputMismatchException ime) {
                        System.out.println("Invalid input. Please try again.");
                        scanner.next(); // Consume the invalid input
                    }
                }

                // Executing the queries present in batch file
                int[] updateCounts = pstmt.executeBatch();
                System.out.println("Records inserted successfully: " + updateCounts.length);

            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtil.cleanUp(connection, pstmt, null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
