package ExceptionProgram;

import java.sql.*;
//Checked Exceptions-SQLException
public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // This will fail without DB connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}

