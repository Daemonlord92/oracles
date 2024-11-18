package org.blitmatthew.entity;

public class Person {
    private String name;
    private int age;
    private String city;
    private double salary;
    private Gender gender;

    // Enum for gender
    public enum Gender {
        MALE, FEMALE, OTHER
    }

    // Constructor
    public Person(String name, int age, String city, double salary, Gender gender) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }
    public double getSalary() { return salary; }
    public Gender getGender() { return gender; }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // toString for easy printing
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
