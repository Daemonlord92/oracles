package org.blitmatthew.Helper;

import java.util.function.IntConsumer;

public class Calculator {

    public Integer add(Integer a, Integer b) {
        return a+b;
    }

    public void add(Integer integer, IntConsumer intConsumer) {
        intConsumer.accept(integer);
    }
}
