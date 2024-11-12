package org.blitmatthew.repository;

import org.blitmatthew.config.DatabaseConnection;
import org.blitmatthew.entity.Inventory;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class InventoryRepository {

    private Connection connection;

    public InventoryRepository() {
        connection = DatabaseConnection.getConnection();
    }

    public Inventory save(Inventory inventory) {
        String sql = "INSERT INTO inventory(product_name, quantity, price, catagory) VALUE(?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, inventory.getProductName());
            statement.setLong(2, inventory.getQuantity());
            statement.setDouble(3, inventory.getPrice());
            statement.setString(4, inventory.getCatagory());
            int row = statement.executeUpdate();
            if(row>0) System.out.println("New inventory item added!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return inventory;
    }

    public List<Inventory> findAll() {
        List<Inventory> inventories = new LinkedList<>();

        String sql = "SELECT * FROM inventory";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while(resultSet.next()) {
                Inventory inventory = new Inventory();
                inventory.setId(resultSet.getLong("id"));
                inventory.setProductName(resultSet.getString("product_name"));
                inventory.setQuantity(resultSet.getLong("quantity"));
                inventory.setPrice(resultSet.getDouble("price"));
                inventory.setCatagory(resultSet.getString("catagory"));
                inventories.add(inventory);
                inventory = null;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return inventories;
    }
}
