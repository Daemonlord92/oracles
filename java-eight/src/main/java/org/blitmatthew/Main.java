package org.blitmatthew;

import org.blitmatthew.Helper.Calculator;

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
        //Function interface
        //Will take in one parameter and give one output
        Function<Integer, Integer> subtract = x -> x-15;
        System.out.println(subtract.apply(45));
        //Predicate Interface
        // will take one parameter and output a boolean value
        Predicate<String> compare = x -> "Hello".equals(x);
        System.out.println(compare.test("Hi"));
        BiPredicate<String, String> compareTo = (x,y) -> x.equals(y);
        System.out.println(compareTo.test("Hello", "Hello"));
        //Supplier Interface
        //Will supply an output
        Supplier<List<Integer>> numListCreator = () -> {
          List<Integer> numList = new ArrayList<>();
            for (int i = 0; i < new Random().nextInt(100); i++) {
                numList.add(new Random().nextInt(500));
            }
            return numList;
        };

        List<Integer> numList = numListCreator.get();
        System.out.println(numList);
        //Consumer Interface
        // Will take in a input but will not return anything
        Consumer<List<Integer>> sortList = x -> Collections.sort(x);

        sortList.accept(numList);
        System.out.println(numList);
        //Lambda Statements
        //Use the Functional solution
        // allows write methods on the fly
        // allows to store the methods as a Object

        Consumer<Integer> print = x-> System.out.println(x);

        exampleMethodWithConsumerDatatype(15, 85, print);
        //Method References
        //Static Reference
        //We don't have instantiated the object to use the references
        //Object Reference
        //We have to instantiate the object to use the Reference
        numList.forEach(System.out::println/*This is an example of Static Method Reference*/);

        Calculator calculator = new Calculator();
        System.out.println(numList.stream().mapMultiToInt(calculator::add/*Object Method Reference*/).findFirst().getAsInt());
        //Optional Class
        //Allows us as developers to check if we got a result from a stream, API call, Database Row Call
        Optional<Integer> optionalI = numList.stream().filter(x -> x > 250).filter(x-> x<400).findFirst();
        if(optionalI.isPresent()){
            System.out.println(optionalI.get());
        }
        Integer optionalInteger = numList.stream().filter(x -> x > 250).filter(x-> x<400).findFirst().orElseThrow(
                ()-> new RuntimeException("Unfortunately the Random generator did not produce the right number")
        );

        Date date = new Date();
        System.out.println(date.toString());
        Date date1 = new Date(1283732897324L);
        System.out.println(date1.toString());
        //LocalDate
        //LocalDateTime
        //LocalTime
        LocalDate date2 = LocalDate.now();
        System.out.println(date2);
        System.out.println(date2.plusDays(31));
        System.out.println(date2.plusYears(100));
    }

    static void exampleMethodWithConsumerDatatype(Integer a, Integer b, Consumer<Integer> printer) {
        printer.accept(a+b);
    }
}