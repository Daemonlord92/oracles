package org.blitmatthew;

import org.blitmatthew.config.DatabaseConnection;
import org.blitmatthew.entity.Stock;
import org.blitmatthew.repository.BuyerRepository;
import org.blitmatthew.repository.StockRepository;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        try {
            if(DatabaseConnection.getConnection().isValid(30)){
                log.log(Level.INFO, "DATABASE CONNECTED");
            }
        } catch (SQLException e) {
            log.log(Level.SEVERE, e.getMessage());
        }

        StockRepository stockRepository = new StockRepository();
        BuyerRepository buyerRepository = new BuyerRepository();
        //stockRepository.findAll().forEach(x -> log.info(x.toString()));
        //log.info(stockRepository.findById(1l).toString());
//        Stock test = new Stock("AMD", 859.76, 60000.0, 30000.0);
//        test.setId(53l);
//        System.out.println(stockRepository.updateMaxStock(test));
//        stockRepository.save(test);
//        buyerRepository.findAll().forEach(System.out::println);
    }
}