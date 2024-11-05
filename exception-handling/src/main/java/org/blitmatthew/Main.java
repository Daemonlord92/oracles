package org.blitmatthew;

import org.blitmatthew.service.Helper;

import java.security.InvalidParameterException;

public class Main {
    public static void main(String[] args) {

        Double[] arrayToBeTested = new Double[0];

        try {
            System.out.println(Helper.checkIfArrayIsEmpty(arrayToBeTested));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        try{
//            System.out.println(4/0);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        } finally {
//
//        }
//
//        try {
//
//        } catch (ArithmeticException | InvalidParameterException exception) {
//
//        }


        System.out.println(Helper.divide(10, 0));

        //This will cause a OutOfMemoryError
//        int i = 1;
//        while(true) {
//            System.out.println(String.valueOf(i++));
//        }
        //This will cause a StackOverFlowError
//        Helper.recurivseMethod();
    }
}