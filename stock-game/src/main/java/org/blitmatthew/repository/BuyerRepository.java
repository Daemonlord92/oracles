package org.blitmatthew.repository;

import org.blitmatthew.config.DatabaseConnection;
import org.blitmatthew.entity.Buyer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BuyerRepository {
    private final Connection connection;

    private final Logger logger = Logger.getLogger(BuyerRepository.class.getName());

    public BuyerRepository() {
        connection = DatabaseConnection.getConnection();
    }

    public List<Buyer> findAll() {
        List<Buyer> buyers = new ArrayList<>();
        String sql = "SELECT id, name, balance FROM buyer";
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Buyer buyer = new Buyer();
                buyer.setId(resultSet.getLong("id"));
                buyer.setName(resultSet.getString("name"));
                buyer.setBalance(resultSet.getDouble("balance"));
                buyers.add(buyer);
                buyer = null;
            }
        } catch (SQLException e) {
            logger.severe(e.getMessage());
        }
        return buyers;
    }
}
