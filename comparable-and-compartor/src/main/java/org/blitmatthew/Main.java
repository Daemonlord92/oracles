package org.blitmatthew;

import org.blitmatthew.entity.Account;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new java.util.ArrayList<>(List.of(
                new Account(1L, 55000.00, "Checking"),
                new Account(2L, 10000.00, "Saving"),
                new Account(3L, 600.00, "Checking"),
                new Account(4L, 450.56, "Saving")
        ));
        System.out.println(accounts);
        Collections.sort(accounts);
        System.out.println(accounts);
        Collections.sort(accounts, Comparator.reverseOrder());
        System.out.println(accounts);
    }
}