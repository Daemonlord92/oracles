package org.blitmatthew.BankingApi.accounts;

import org.blitmatthew.BankingApi.accounts.dto.AccountInformation;
import org.blitmatthew.BankingApi.accounts.dto.PostNewAccountInformation;
import org.blitmatthew.BankingApi.shared.dto.MessageResponse;

public interface AccountService {
    MessageResponse createAccount(PostNewAccountInformation request);
    AccountInformation getAccountById(String id);
}
