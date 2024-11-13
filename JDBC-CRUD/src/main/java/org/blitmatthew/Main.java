package org.blitmatthew;

import org.blitmatthew.config.DatabaseConnection;
import org.blitmatthew.entity.Inventory;
import org.blitmatthew.repository.InventoryRepository;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            if(DatabaseConnection.getConnection().isValid(30)){
                System.out.println("Database Connected");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        InventoryRepository inventoryRepository = new InventoryRepository();

        /*Inventory inventory = new Inventory("HP Gaming Palivion", 50L, 749.99, "Computers");

        inventoryRepository.save(inventory);*/

        inventoryRepository.findAll().forEach(System.out::println);

//        Inventory inventory = inventoryRepository.findById(1l);
//        inventory.setProductName("HP Gaming Pavilion");
//        inventory.setQuantity(250L);
//        inventoryRepository.update(inventory);
//
//        System.out.println(inventoryRepository.findById(1l));

        inventoryRepository.deleteById(1l);

        inventoryRepository.findAll().forEach(System.out::println);
    }
}