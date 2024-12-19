package org.blitmatthew.BankingApi.user_profile.exception;

import jakarta.persistence.EntityNotFoundException;

public class UserProfileNotFoundException extends EntityNotFoundException {
    public UserProfileNotFoundException(String s) {
        super(s);
    }
}
