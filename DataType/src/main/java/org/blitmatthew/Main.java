package org.blitmatthew;

public class Main {
    public static void main(String[] args) {
        // There two different data type in most programming languages
        //Primitive Data Type
        //number type
        // byte, short, int, long, float, double
        // Character Data Type
        // char
        //takes in single character, it also can take in the numeric value behind the character
        //Boolean Type
        //boolean
        // true or false
        // 1 or 0
        //byte has 8 bits
        // -128 to 127
        //short has 16 bits
        // -32768 - 32767
        //int has 32 bits
        // -2,147,483,648 to 2,147,483,647
        //long has 64 bits
        //  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //float has 32 bits
        //1 bit for the sign
        // 8 bits for exponent
        //23 bits for the actual number
        //double has 64 bits
        // 1 bit for the sign
        // 11 bits exponent
        // 52 bits for the actual number
        // char has 16 bit
        // Boolean only needs 1 bit
//        char a = 'a';
//        char a2 = 138;
//
//        System.out.println(a);
//        System.out.println();
//        System.out.println(a2);
        //Reference Data Types
        //These stored the heap and stores a reference address in the stack
        //Reference Data Type are All Objects
        //Built in classes String, StringBuilder, System, Object
        //Custom Classes produces Reference DataTypes too
//        int maxInt = Integer.MAX_VALUE;
//        System.out.println("Maximum Int Value " + maxInt);
//        System.out.println();
//        System.out.println(maxInt += 1);
//        System.out.println();
//        System.out.println(maxInt += 1);
//        System.out.println();
//        System.out.println(maxInt += 1);
        /*
        * Create a TemperatureConverter
        * 1. It should ask for an input in either float or double
        * 2. It should convert the input to Celsius
        * 3. it Should Display both the Original input and the conversion
        * 4. Give an indicator if water would freeze, boil, or be liquid
        * */

        /*
        * Create a program that:

        Stores information about a bank account using appropriate data types
        Handles deposits and withdrawals
        Calculates interest
        Prevents common errors like overflow and incorrect decimal calculations

        Key points to emphasize throughout the lesson:

        Always choose the appropriate data type for your needs
        Be aware of the limitations of each data type
        Understand when to use primitive vs reference types
        Pay attention to precision when working with floating-point numbers
        Consider memory usage when selecting data types
        * */

        int intResult = 23/5;
        System.out.println(intResult);
        System.out.println((double) intResult);
    }
}