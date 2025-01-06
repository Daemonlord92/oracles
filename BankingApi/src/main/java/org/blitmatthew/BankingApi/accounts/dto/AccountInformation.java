package org.blitmatthew.BankingApi.accounts.dto;

import org.blitmatthew.BankingApi.accounts.enums.AccountType;

import java.time.LocalDate;

public record AccountInformation(
        String accountIdentifier,
        AccountType accountType,
        Double balance,
        Boolean isActive,
        LocalDate createdAt
) {
}
