package org.blitmatthew;


import org.blitmatthew.example.Example;

public class Main {
    public static void main(String[] args) {
        // This is an Initialized Object
        // We are able to manipulate it and/or modify it.
        System.out.println(Animal.getAnimalCount());
        Animal cat = new Animal("Skeeters", "Orange Tabby Cat", 0.5, 4.5);
        cat.setName("Mark");
        cat.setHeight(5.5);
        cat.setWeight(125.00);
        cat.setSpecies("Cheetah");
        System.out.println(Animal.getAnimalCount());
        Animal dog = new Animal();
        Animal lion = new Animal();
        Animal bear = new Animal();
        System.out.println(Animal.getAnimalCount());

        //Numerical Data Types

        // Byte
        // Smallest number
        // Size 8 bits
        // 10101010
        // Limit -128 - 127
        byte errorByte = 64;
        //System.out.println(errorByte);

        //Short
        //Size 16 bits
        // Limit -32768 - 32767
        short shortExample = 1200;

        //Integer
        //Size 32 bits
        //Limit -2147483648 - 2147483647
        int integerExample = 900000;

        // Float
        // Decimal Numbers
        // Size 32 bits
        // Limit 3.4e-38 - 3.4e+38
        float floatExample = 3.14f;

        //Double
        // Size 64 bits
        // Limit 1.7e-308 - 1.7e+308
        double doubleExample = 66.666666670000000000000000000000000000000;

        // Long
        // Size 64 bits
        // Limit -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807
        long longExample = 56000L;

        // Char
        // Short for character

        char charExample1 = 'A';
        char charExample2 =  44;

        System.out.println(charExample1);
        System.out.println(charExample2);

        // Boolean
        // True or False
        boolean booleanExample = true;

        long number = Example.getSerialVersionId();


    }
}