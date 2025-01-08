package org.blitmatthew.BankingApi.transactions.dto;

import org.blitmatthew.BankingApi.transactions.enums.TransactionType;

public record PostNewTransaction(
        String fromId,
        String toId,
        double amount,
        TransactionType transactionType
) {
}
