package org.blitmatthew.BankingApi.accounts;

import org.blitmatthew.BankingApi.accounts.dto.AccountInformation;
import org.blitmatthew.BankingApi.accounts.dto.PostNewAccountInformation;
import org.blitmatthew.BankingApi.accounts.exception.BankAccountNotFoundException;
import org.blitmatthew.BankingApi.entity.Account;
import org.blitmatthew.BankingApi.shared.dto.MessageResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public MessageResponse createAccount(PostNewAccountInformation request) {
        Account account = new Account();
        account.setAccountType(request.accountType());
        account.setBalance(request.balance());
        account.setCreatedAt(LocalDate.now());
        account.setIsActive(true);
        accountRepository.save(account);
        return new MessageResponse("Account has been created!");
    }

    @Override
    public AccountInformation getAccountById(String id) {
        Account account = accountRepository.findById(id).orElseThrow((() ->
                new BankAccountNotFoundException("Account with the id ".concat(id).concat(" was not found!"))));
        return new AccountInformation(
                account.getId(),
                account.getAccountType(),
                account.getBalance(),
                account.getIsActive(),
                account.getCreatedAt()
        );
    }
}
