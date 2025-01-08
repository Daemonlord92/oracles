package org.blitmatthew.BankingApi.transactions;

import org.blitmatthew.BankingApi.accounts.AccountRepository;
import org.blitmatthew.BankingApi.accounts.exception.BankAccountNotFoundException;
import org.blitmatthew.BankingApi.entity.Account;
import org.blitmatthew.BankingApi.entity.Transaction;
import org.blitmatthew.BankingApi.shared.dto.MessageResponse;
import org.blitmatthew.BankingApi.transactions.dto.PostNewTransaction;
import org.blitmatthew.BankingApi.transactions.dto.TransactionInformation;
import org.blitmatthew.BankingApi.transactions.enums.TransactionStatus;
import org.blitmatthew.BankingApi.transactions.enums.TransactionType;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository, AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }


    @Override
    public MessageResponse createTransaction(PostNewTransaction postNewTransaction) {
        Transaction transaction = new Transaction();
        transaction.setFromId(postNewTransaction.fromId());
        transaction.setToId(postNewTransaction.toId());
        transaction.setTransactionType(postNewTransaction.transactionType());
        transaction.setAmount(postNewTransaction.amount());
        transaction.setTransactionStatus(TransactionStatus.PENDING);
        transaction.setCreatedAt(LocalDateTime.now());
        transaction = transactionRepository.save(transaction);
        Transaction finalTransaction = transaction;
        Thread thread = new Thread(() -> {
            try{
                Thread.sleep(1000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if((finalTransaction.getId().length() > 0)){
                updateTransaction(finalTransaction);
            }
        });
        thread.start();
        return new MessageResponse("Transaction Posted");
    }

    @Override
    public List<TransactionInformation> getTransactionsByAccountId(String id) {
        List<Transaction> transactions = transactionRepository.findTransactionsByToIdOrFromId(id,id);
        List<TransactionInformation> transactionInformations = new LinkedList<>();
        transactions.forEach(transaction -> {
            TransactionInformation transactionInformation = new TransactionInformation(
                    transaction.getFromId(),
                    transaction.getToId(),
                    transaction.getAmount(),
                    transaction.getTransactionType(),
                    transaction.getTransactionStatus(),
                    transaction.getCreatedAt()
            );
            transactionInformations.add(transactionInformation);
            transactionInformation = null;
        });
        return transactionInformations;
    }

    private void updateTransaction(Transaction transaction) {
        Account toAccount = accountRepository.findById(transaction.getToId()).orElseThrow(() ->
                new BankAccountNotFoundException("Account with id of "
                        .concat(transaction.getToId())
                        .concat(" cannot be found!")));
        if(transaction.getFromId().length() <= 0 && transaction.getTransactionType().equals(TransactionType.WITHDRAW)){
            Account fromAccount = accountRepository.findById(transaction.getFromId()).orElseThrow(() ->
                    new BankAccountNotFoundException("Account with id of "
                            .concat(transaction.getFromId())
                            .concat(" cannot be found!")));
            if(fromAccount.getBalance() >= transaction.getAmount()){
                transaction.setTransactionStatus(TransactionStatus.COMPLETED);
                fromAccount.setBalance(fromAccount.getBalance() - transaction.getAmount());
                toAccount.setBalance(toAccount.getBalance() + transaction.getAmount());
                transactionRepository.save(transaction);
                accountRepository.save(fromAccount);
                accountRepository.save(toAccount);
                return;
            }
        }
        transaction.setTransactionStatus(TransactionStatus.COMPLETED);
        toAccount.setBalance(toAccount.getBalance() + transaction.getAmount());
        accountRepository.save(toAccount);
        transactionRepository.save(transaction);
    }
}
