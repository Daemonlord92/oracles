package org.blitmatthew.entity;

import java.io.Serializable;
import java.util.Objects;

public class Stock implements Serializable {
    private Long id;
    private String name;
    private Double price;
    private Double maxStockAmount;
    private Double stocksOwned;

    public Stock() {
    }

    public Stock(String name, Double price, Double maxStockAmount, Double stocksOwned) {
        this.name = name;
        this.price = price;
        this.maxStockAmount = maxStockAmount;
        this.stocksOwned = stocksOwned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMaxStockAmount() {
        return maxStockAmount;
    }

    public void setMaxStockAmount(Double maxStockAmount) {
        this.maxStockAmount = maxStockAmount;
    }

    public Double getStocksOwned() {
        return stocksOwned;
    }

    public void setStocksOwned(Double stocksOwned) {
        this.stocksOwned = stocksOwned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(getId(), stock.getId()) && Objects.equals(getName(), stock.getName()) && Objects.equals(getPrice(), stock.getPrice()) && Objects.equals(getMaxStockAmount(), stock.getMaxStockAmount()) && Objects.equals(getStocksOwned(), stock.getStocksOwned());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice(), getMaxStockAmount(), getStocksOwned());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stock: ");
        sb.append("name= '").append(name).append('\'');
        sb.append(", price= ").append(price);
        sb.append(", maxStockAmount= ").append(maxStockAmount);
        sb.append(", stocksOwned= ").append(stocksOwned);
        return sb.toString();
    }


}
