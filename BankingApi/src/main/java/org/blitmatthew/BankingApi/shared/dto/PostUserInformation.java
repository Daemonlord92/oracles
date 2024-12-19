package org.blitmatthew.BankingApi.shared.dto;

public record PostUserInformation(
        String firstName,
        String lastName,
        String email,
        String password,
        String address,
        long phone,
        String dateOfBirth
) {
}
