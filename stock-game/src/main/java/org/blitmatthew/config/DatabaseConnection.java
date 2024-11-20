package org.blitmatthew.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection implements AutoCloseable {

    private static final Logger log = Logger.getLogger(DatabaseConnection.class.getName());

    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/stock_game",
                    "root",
                    "Gudmord92!"
            );
        } catch (SQLException e) {
            log.log(Level.SEVERE, e.getMessage());
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    @Override
    public void close() throws Exception {
        log.log(Level.INFO, "DATABASE CONNECTION CLOSING");
        if(!connection.isClosed()) {
            log.log(Level.INFO, "DATABASE CLOSED");
        }
    }
}
