package org.blitmatthew.service;

import org.blitmatthew.exception.DivideByZeroException;

public class Helper {
    public static boolean checkIfArrayIsEmpty(Object[] arrayToBeChecked) {
        if(arrayToBeChecked.length <= 0) {
            throw new RuntimeException("The Array hasn't been initialized");
        }

        boolean result = false;

        for (int i = 0; i < arrayToBeChecked.length; i++) {
            if (arrayToBeChecked[i] != null){
                result = true;
            }
        }

        return result;
    }

    public static int divide(int a, int b){
        if(b == 0) throw new DivideByZeroException("You cannot divide by zero");
        return a/b;
    }

    public static void recurivseMethod() {
        recurivseMethod();
    }
}
