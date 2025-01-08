package org.blitmatthew.BankingApi.transactions;

import org.blitmatthew.BankingApi.entity.Transaction;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends ListCrudRepository<Transaction, String> {
    Optional<Transaction> findTopByOrderByIdDesc();
    List<Transaction> findTransactionsByToIdOrFromId(String toId, String fromId);
}
