package org.blitmatthew.repository;

import org.blitmatthew.config.DatabaseConnection;

import java.sql.Connection;

public class BuyerStockRepository {
    private final Connection connection;

    public BuyerStockRepository() {
        connection = DatabaseConnection.getConnection();
    }
}
