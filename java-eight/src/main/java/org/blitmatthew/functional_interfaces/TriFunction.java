package org.blitmatthew.functional_interfaces;

@FunctionalInterface
// Can only have 1 abstract method in the interface but can have multiple static or default methods
public interface TriFunction<T, U, P, K> {
    K apply(T t, U u, P p);

    default Integer add(Integer a, Integer b) {
        return a+b;
    }

    static Integer subtract(Integer a, Integer b) {
        return a - b;
    }
}
