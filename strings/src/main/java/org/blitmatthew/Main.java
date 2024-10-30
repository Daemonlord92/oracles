package org.blitmatthew;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //First String Object with Hello, World init
        String example = "He llo, Wor ld";

        //Second String Object with Hello, World init
        String example1 = new String("Hello, World");
        System.out.println(System.identityHashCode(example));
        System.out.println(System.identityHashCode(example1));

        //Example of retrieving the length of the string
        System.out.println(example.length());

        //Example of using charAt to identify the whitespace in a string.
        for (int i = 0; i < example.length(); i++) {
            if(example.charAt(i) == ' ') {
                System.out.println("Invalid Password, we found a whitespace in there");
            }
        }

        // Ways to combined two or more strings together.
        String firstPart = "I went jumping over the hill,";
        String secondPart = " but I didn't see the drop";
        // firstPart + secondPart
        String joinedStr = firstPart.concat(secondPart);

        System.out.println("First Part: ".concat(firstPart));
        System.out.println("Second Part: ".concat(secondPart));
        System.out.println("Strings combined into one: ".concat(joinedStr));
        //ComparingStrings

        Scanner scanner = new Scanner(System.in);
        String answer = "checking";

        if(answer.equals("Checking")) {
            System.out.println("You have selected a checking Account");
        } else {
            System.out.println("You did not select a valid option");
        }

        if(answer.equalsIgnoreCase("CHECKING")){
            System.out.println("You have selected a checking Account");
        }
        //Substring example
        System.out.println(answer.substring(0, 3));
        //Contains Example
        System.out.println(answer.contains("zgh"));

        System.out.println(answer.contains("eck"));

        String str1 = "I";
        String str2 = "love";
        String str3 = "Programming";
        //Joins Example
        String joinedString = String.join(";", str1, str2, str3);
        System.out.println(joinedString);
        //Replace example
        String str4 = "The cat sat on the mat";

        str4 = str4.replace("cat", "bat");

        str4 = str4.replace("mat", "hat");

        System.out.println(str4);
        //ReplaceAll
        joinedString = joinedString.replaceAll(";", " ");
        System.out.println(joinedString);

        //indexOf example

        String longString = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(longString.indexOf('m'));
        System.out.println(longString.indexOf('z'));
    }
}