package org.blitmatthew.BankingApi.transactions.dto;

import org.blitmatthew.BankingApi.transactions.enums.TransactionStatus;
import org.blitmatthew.BankingApi.transactions.enums.TransactionType;

import java.time.LocalDateTime;

public record TransactionInformation(
        String fromId,
        String toId,
        double amount,
        TransactionType transactionType,
        TransactionStatus transactionStatus,
        LocalDateTime createdAt
) {
}
