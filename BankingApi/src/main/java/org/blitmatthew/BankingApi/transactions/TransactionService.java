package org.blitmatthew.BankingApi.transactions;

import org.blitmatthew.BankingApi.shared.dto.MessageResponse;
import org.blitmatthew.BankingApi.transactions.dto.PostNewTransaction;
import org.blitmatthew.BankingApi.transactions.dto.TransactionInformation;

import java.util.List;

public interface TransactionService {
    MessageResponse createTransaction(PostNewTransaction postNewTransaction);
    List<TransactionInformation> getTransactionsByAccountId(String id);
}
