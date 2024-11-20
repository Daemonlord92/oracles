package org.blitmatthew.repository;

import org.blitmatthew.config.DatabaseConnection;
import org.blitmatthew.entity.Stock;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StockRepository {
    private final Connection connection;

    private static final Logger logger = Logger.getLogger(StockRepository.class.getName());

    public StockRepository() {
        connection = DatabaseConnection.getConnection();
    }

    public List<Stock> findAll() {
        String sql = "SELECT id, name, price, stocks_owned, max_stock_amount FROM stocks";
        List<Stock> stocks = new ArrayList<>();
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Stock stock = new Stock();
                stock.setId(resultSet.getLong("id"));
                stock.setName(resultSet.getString("name"));
                stock.setPrice(resultSet.getDouble("price"));
                stock.setStocksOwned(resultSet.getDouble("stocks_owned"));
                stock.setMaxStockAmount(resultSet.getDouble("max_stock_amount"));
                stocks.add(stock);
                stock = null;
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
        return stocks;
    }

    public Stock findById(Long id) {
        Stock stock;
        String sql = "SELECT id, name, price, stocks_owned, max_stock_amount FROM stocks WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()){
                resultSet.next();
                stock = new Stock();
                stock.setId(resultSet.getLong("id"));
                stock.setName(resultSet.getString("name"));
                stock.setPrice(resultSet.getDouble("price"));
                stock.setStocksOwned(resultSet.getDouble("stocks_owned"));
                stock.setMaxStockAmount(resultSet.getDouble("max_stock_amount"));
            }
        } catch (SQLException e) {
            stock = null;
            logger.severe(e.getMessage());
        }
        return stock;
    }

    public Stock save(Stock stock) {
        String sql = "INSERT INTO stocks (name, price, max_stock_amount, stocks_owned) VALUE (?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, stock.getName());
            statement.setDouble(2, stock.getPrice());
            statement.setDouble(3, stock.getMaxStockAmount());
            statement.setDouble(4, stock.getStocksOwned());
            int row = statement.executeUpdate();
            if(row > 0) {
                logger.info("Database table stocks updated with a new row");
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        stock.setId(generatedKeys.getLong(1));
                    } else {
                        logger.severe("No ID generated for the inserted stock.");
                    }
                }
            }
        } catch (SQLException e) {
            logger.severe(e.getMessage());
        }
        return stock;
    }

    public Stock updatePrice(Stock stock) {
        String sql = "UPDATE stocks SET price=? WHERE id=?";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, stock.getPrice());
            statement.setLong(2, stock.getId());
            int row = statement.executeUpdate();
            if(row > 0){
                logger.info("Updated row ".concat(String.valueOf(stock.getId())).concat(" inside the stocks table"));
            }
        } catch (SQLException e) {
            logger.severe(e.getMessage());
        }
        return stock;
    }

    public Stock updateMaxStock(Stock stock) {
        String sql = "UPDATE stocks SET max_stock_amount=? WHERE id=?";
        try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, stock.getMaxStockAmount());
            statement.setLong(2, stock.getId());
            int row = statement.executeUpdate();
            if(row > 0){
                logger.info("Updated row ".concat(String.valueOf(stock.getId())).concat(" inside the stocks table"));
            }
        } catch (SQLException e) {
            logger.severe(e.getMessage());
        }
        return stock;
    }
}
