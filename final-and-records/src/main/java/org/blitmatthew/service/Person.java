package org.blitmatthew.service;

public class Person {
    private final String name;
    private final Double height;
    private final Double weight;

    public Person(String name, Double height, Double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }
}
