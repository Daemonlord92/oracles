package org.blitmatthew.BankingApi.accounts.exception;

import jakarta.persistence.EntityNotFoundException;

public class BankAccountNotFoundException extends EntityNotFoundException {
    public BankAccountNotFoundException(String message) {
        super(message);
    }
}
