package org.blitmatthew.entity;

import java.io.Serializable;
import java.util.Objects;

public class Buyer implements Serializable {
    private Long id;
    private String name;
    private Double balance;

    public Buyer() {
    }

    public Buyer(String name, Double balance) {
        this.name = name;
        this.balance = balance;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buyer buyer = (Buyer) o;
        return Objects.equals(getId(), buyer.getId()) && Objects.equals(getName(), buyer.getName()) && Objects.equals(getBalance(), buyer.getBalance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBalance());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Buyer: ");
        sb.append("name= '").append(name).append('\'');
        sb.append(", balance= ").append(balance);
        return sb.toString();
    }
}
