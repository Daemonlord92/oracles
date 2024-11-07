package org.blitmatthew;

import org.blitmatthew.entity.Account;
import org.blitmatthew.entity.CreditAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double d = 750.99;
        System.out.println(add((int) d, 55));
        //Explicit Casting
        //Narrowing Casting
        //From Larger Data Type to Smaller Data type
        int i = (int) d;
        d = i;
        System.out.println(d);

        char a = 65;
        System.out.println(a);
        //Implicit Casting
        //Widening Casting
        //Convert a smaller data type to a larger.
        short s = 50;
        byte b = 8;
        System.out.println(add(s, b));

        CreditAccount account = new CreditAccount();

        System.out.println((Account) account);
    }

    static int add(int a, int b) {
        return a+b;
    }
}