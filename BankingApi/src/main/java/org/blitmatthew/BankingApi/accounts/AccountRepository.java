package org.blitmatthew.BankingApi.accounts;

import org.blitmatthew.BankingApi.entity.Account;
import org.springframework.data.repository.ListCrudRepository;

public interface AccountRepository extends ListCrudRepository<Account, String> {
}
