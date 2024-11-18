package org.blitmatthew;

import org.blitmatthew.entity.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 28, "New York", 75000.0, Person.Gender.FEMALE),
                new Person("Bob", 35, "San Francisco", 95000.0, Person.Gender.MALE),
                new Person("Charlie", 42, "Chicago", 85000.0, Person.Gender.MALE),
                new Person("Diana", 31, "New York", 80000.0, Person.Gender.FEMALE),
                new Person("Eve", 45, "Boston", 90000.0, Person.Gender.FEMALE),
                new Person("Frank", 39, "San Francisco", 88000.0, Person.Gender.MALE)
        );

        System.out.println("Person over 35");
        persons.stream().filter(person -> person.getAge() > 35).forEach(System.out::println);

        double averageSalary = persons.stream()
                .mapToDouble(Person::getSalary)
                .average()
                .orElse(0.0);
        System.out.println(averageSalary);

        System.out.println("Persons grouped by city");

        persons.stream()
                .collect(Collectors.groupingBy(Person::getCity))
                .forEach((city, personsInCity) -> {
                    System.out.println(city +": ");
                    personsInCity.forEach(System.out::println);
                });

        System.out.println(
        );
        System.out.println();

        Map<String, List<Person>> personMap = new HashMap<>();
        for(Person person : persons) {
            if(personMap.containsKey(person.getCity())){
                personMap.get(person.getCity()).add(person);
            } else {
                personMap.put(person.getCity(), new ArrayList<>(List.of(person)));
            }
        }
        personMap.forEach((city, personsInCity) -> {
            System.out.println(city + ": ");
            personsInCity.forEach(System.out::println);
        });

        System.out.println();
        System.out.println();
        System.out.println(persons.stream().mapToDouble(Person::getSalary).summaryStatistics());

        persons.stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.counting()))
                .forEach((gender, count) -> System.out.println(gender + ": " + count));
    }
}