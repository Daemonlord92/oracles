package org.blitmatthew;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Arrays
        // Are Static Typed and Static Sized
        // Static Size meaning once the size of the array is set it cannot be changed.
        int[] numArray = new int[8];
        for(int i = 0; i < numArray.length; i++) {
            numArray[i] = i+2;
        }
  // false || ture =>
        // (6 / 2==  0)
        // O101010101 010101010 000110101 000011110 \

        // 2  short , long, int ,double
        //   010101
        // bit [01010101]
        // 01010101
        // 1 0   jack =>    interpreter/ compiler      binary
        double num = 2;



        //
        System.out.println(Arrays.toString(numArray));

        String[] strArray = new String[8];

        strArray[0] = "hello";

        System.out.println(Arrays.toString(strArray));
        //Regular For-Loop
        // Iterator variable
        // this will keep track of our current index and increment it after each loop
        for(int i = 0; i < numArray.length; i++) {
            if(strArray[i] == null) {
                strArray[i] = i + " Good Morning";
            }
        }

        //Enhanced For Loop
        // Does not have the Iterator Variable
        // it will create a copy of the element out of the array/collection
        // to display or modify it
        for(String str : strArray) {
            System.out.println(str);
        }

        System.out.println(Arrays.toString(strArray));

        int[] exampleArray;

        //bunch for loops

        exampleArray = new int[strArray.length];

        // Init the Array with Data inside
        int[] numList = {1,3,4,2,8,5,9, 11};
        System.out.println(Arrays.toString(retrieveEvenNumbers(numList)));

        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[i].length; i1++) {
                matrix[i][i1] = new Random().nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        matrix[1][2] = 55;

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        Arrays.sort(matrix[0]);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        String[][] strMatrix = {
                {"Good Morning", "Hats off to you", "Peace be with you"},
                {"Hello, World", "Chitor Astim", "Como Estas"},
                {"estoy beno", "Aland", "Merhaba"}
        };

        System.out.println(Arrays.binarySearch(strMatrix[1], "Como Estas"));
    }

    static int[] retrieveEvenNumbers(int[] arr){
        // We declare the Array Container/Variable
        int[] result;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        // The Array Variable is Initialized here
        result = new int[count];
        int placeholder = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                result[placeholder++] = arr[i];
            }
        }
        // Then the new array is return filled with the correct data.
        return result;
    }
}