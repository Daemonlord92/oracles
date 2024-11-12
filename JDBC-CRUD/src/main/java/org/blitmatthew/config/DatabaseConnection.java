package org.blitmatthew.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements AutoCloseable{

    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_database",
                    "root",
                    "Gudmord92!"
            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    @Override
    public void close() throws Exception {
        System.out.println("CLOSING CONNECTION");
        if(connection != null && !connection.isClosed()){
            connection.close();
        }
    }
}
