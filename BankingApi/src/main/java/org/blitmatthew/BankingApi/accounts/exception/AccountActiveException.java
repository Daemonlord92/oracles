package org.blitmatthew.BankingApi.accounts.exception;

public class AccountActiveException extends RuntimeException {
    public AccountActiveException(String message) {
        super(message);
    }
}
