package org.blitmatthew.BankingApi.accounts.dto;

import org.blitmatthew.BankingApi.accounts.enums.AccountType;

public record PostNewAccountInformation(
        AccountType accountType,
        double balance
) {
}
