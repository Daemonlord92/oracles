package org.blitmatthew.entity;

import java.util.Comparator;
import java.util.Objects;

public class Account implements Comparable, Comparator {
    private Long id;
    private Double balance;
    private String accountType;

    public Account() {
    }

    public Account(Long id, Double balance, String accountType) {
        this.id = id;
        this.balance = balance;
        this.accountType = accountType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public int compare(Object o1, Object o2) {
        int accountBalanceComparsion = ((Account) o1).getBalance().compareTo(((Account) o2).getBalance());
        if(accountBalanceComparsion != 0){
            return accountBalanceComparsion;
        }
        return Integer.compare(((Account) o1).getAccountType().length(),((Account) o2).getAccountType().length());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(getId(), account.getId()) && Objects.equals(getBalance(), account.getBalance()) && Objects.equals(getAccountType(), account.getAccountType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBalance(), getAccountType());
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.getBalance().compareTo(((Account) o).getBalance());
    }
}
