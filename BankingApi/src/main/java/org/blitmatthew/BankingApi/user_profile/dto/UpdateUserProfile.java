package org.blitmatthew.BankingApi.user_profile.dto;

public record UpdateUserProfile(
        String address,
        long phone,
        String firstName,
        String lastName,
        String id
) {
}
