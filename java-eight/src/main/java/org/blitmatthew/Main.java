package org.blitmatthew;

import org.blitmatthew.Helper.Calculator;
import org.blitmatthew.entity.Person;

import java.time.LocalDate;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        BiFunction<Integer, Integer, Integer> add = (x,y) -> x+y;
//        System.out.println(add.apply(4, 5));
//
//        Supplier<Double> randomDouble = () -> new Random().nextDouble();
//
//        System.out.println(randomDouble.get());
//        System.out.println(randomDouble.get());
//        System.out.println(randomDouble.get());
//        System.out.println(randomDouble.get());
//        System.out.println(randomDouble.get());
//        System.out.println(randomDouble.get());
//
//        List<String> strList = new ArrayList<>();
//        strList.add("Fawad");
//        strList.add("Haqmal");
//        strList.add("Yohannes");
//        strList.add("Fatima");
//        strList.add("Fahima");
////        for (int i = 0; i < strList.size(); i++) {
////            if(strList.get(i).startsWith("F")){
////                System.out.println(strList.get(i));
////            }
////        }
//        strList.stream().filter(name -> name.startsWith("F")).sorted().toList().forEach(System.out::println);
//

        // Functional Interfaces
        // Single Abstract Methods
        // Multiple Default or Static Methods
        // Turn are Methods into DataTypes to passed around
        // Also allows us to give specific implementations for methods on the Fly.
        // Java 8 Built in FunctionalInterfaces
        // Function Interface
        // Allows to write a function and store in variable to be called on the fly.
        Function<String, Boolean> containsVowels = (x) -> {
            String vowels = "aeiouAEIOU";
          for(Character c : x.toCharArray()){
              for(Character k : vowels.toCharArray()){
                  if(c == k) {
                      return true;
                  }
              }
          }
          return false;
        };

        System.out.println(containsVowels.apply("jst"));
        System.out.println(containsVowels.apply("Haqmal"));

        //Predicate Interface
        // Take in one param and return a boolean value based off of it
        Predicate<Integer> isLessThanHundred = x -> x < 100;

        System.out.println(isLessThanHundred.test(75));
        System.out.println(isLessThanHundred.test(115));

        //Supplier Interface
        //This one will just supply data out of it
        Supplier<String> randomName = () -> {
            Integer randomInt = new Random().nextInt(10);
            List<String> names = List.of(
                    "Matthew",
                    "Fawad",
                    "Haqmal",
                    "Yaman",
                    "Yohannes",
                    "Fatima",
                    "Fahima",
                    "Amos",
                    "Nazi",
                    "Wilfred"
            );
            return names.get(randomInt);
        };

        String name = randomName.get();
        System.out.println(name);
        System.out.println(randomName.get());
        System.out.println(randomName.get());
        System.out.println(randomName.get());
        System.out.println(randomName.get());
        System.out.println(randomName.get());
        System.out.println(randomName.get());
        System.out.println(randomName.get());

        //Consumer Interface
        // This will take in a param but will not return anything

        Consumer<Person> modifyAge = x -> x.setAge(LocalDate.now().getYear() - x.getDob().getYear());

        Person person = new Person();
        person.setName("Fawad");
        person.setGender("Male");
        person.setDob(LocalDate.parse("2001-01-29"));

        modifyAge.accept(person);

        System.out.println(person.getAge());

        //Optional Class
        //is a Wrapper Class/ Container Class
        // NullPointerException
        // Programming Languages HATE Nulls
        Optional<Person> optionalPerson = Optional.of(person);
        if(optionalPerson.isPresent()) {
            System.out.println("Person Object is Available");
        }

    }

    static void exampleMethodWithConsumerDatatype(Integer a, Integer b, Consumer<Integer> printer) {
        printer.accept(a+b);
    }
}