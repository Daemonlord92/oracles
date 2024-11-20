package org.blitmatthew.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class BuyerStock implements Serializable {
    private Buyer buyer;
    private List<Stock> stocks;
    private Double quantity;

    public BuyerStock() {
    }

    public BuyerStock(Buyer buyer, List<Stock> stocks, Double quantity) {
        this.buyer = buyer;
        this.stocks = stocks;
        this.quantity = quantity;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuyerStock that = (BuyerStock) o;
        return Objects.equals(getBuyer(), that.getBuyer()) && Objects.equals(getStocks(), that.getStocks()) && Objects.equals(getQuantity(), that.getQuantity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBuyer(), getStocks(), getQuantity());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BuyerStock: ");
        sb.append("buyer: ").append(buyer);
        sb.append(", stocks: ").append(stocks);
        sb.append(", quantity: ").append(quantity);
        return sb.toString();
    }
}
