package org.blitmatthew;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    static class Student {
        private String name;
        private int grade;
        private float gpa;

        public  Student(String name, int grade, float gpa) {
            this.name = name;
            this.grade = grade;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public float getGpa() {
            return gpa;
        }

        public void setGpa(float gpa) {
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Student{");
            sb.append("name='").append(name).append('\'');
            sb.append(", grade=").append(grade);
            sb.append(", gpa=").append(gpa);
            sb.append('}');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        //Tradition before Java 8
        Thread tradThread = new Thread(new Runnable() {
            //Override is used for Runtime Polymorphism (Method Overriding)
            @Override
            public void run() {
                System.out.println("Running in the old way");
            }
        });
        //Introduction of Java 8 Lambda Expressions
        // One it improved our code by not only shortening it
        // but also by making more readable
        Thread lambdaThread = new Thread(() -> System.out.println("Running in lambda"));

        tradThread.start();
        lambdaThread.start();
        //No Param setup for a Lambda statement
        Runnable runnable = () -> System.out.println("Example No Params");
        // Single Param Setup
        Consumer<String> oneParam = message -> System.out.println(message);
        // Multiple param lambda setup
        BiFunction<Integer, Integer, Integer> twoParams = (a, b) -> a+b;

        //Multiline Lambda Statement
        BiFunction<String, Integer, String> mappedTogether = (a,b) -> {
            StringBuilder sb = new StringBuilder(a);
            sb.append(b);
            return sb.toString();
        };

        System.out.println(mappedTogether.apply("Money Storage ", 600));

        //Lambda Statements with StreamAPI
        //Stream Api was developed to help process collection in declarative and functional way
        //Lambda add more power behind
        List<Student> students = new ArrayList<>();
        students.addAll(List.of(
                new Student("Fawad", 4, 3.5f),
                new Student("Yaman", 10, 3.9f),
                new Student("Fatima", 6, 3.74f)
        ));
        List<Student> highestGpa = students.stream()
                .filter(student -> student.getGpa()>3.5f)
                .toList();
        System.out.println(highestGpa);
        float averageGpa = (float) students.stream()
                .mapToDouble(student -> student.getGpa())
                .average().getAsDouble();
        System.out.println(averageGpa);
        //FunctionalInterfaces allows us to write methods on the fly in functional and more declarative manner
        //They also gives us the ability to pass methods as a DataType to be used by the method we are passing it doing to
        // They prominently used by Lambda Statements
        Function<String, String> concatStrings = a ->{
            return a.concat(" ").concat(a);
        } ;
        methodUsingFunctionalInterfaceAsDataType(concatStrings);
    }
    //Example of passing the FunctionalInterface as Datatype
    //even through the method may not know what is happening with the Function
    //it still is able to use it
    // Applying level of the Interface Segration Principle and Abstraction Pillar of OOP
    static void methodUsingFunctionalInterfaceAsDataType(Function<String, String> con){
        System.out.println(con.apply("Hello"));

    }

    //Examples of Method Overloading ( Compile Time Polymorphism )
    static int add(int a, int b) {
        return a+b;
    }

    static int add(int a, int b, int c) {
        return a+b+c;
    }

    static double add(double a, double b) {
        return a+b;
    }
}