package org.blitmatthew.BankingApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.blitmatthew.BankingApi.accounts.enums.AccountType;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private AccountType accountType = AccountType.CHECKING;
    private Double balance;
    private Boolean isActive;
    private LocalDate createdAt;
    private LocalDate disabledAt;
}
