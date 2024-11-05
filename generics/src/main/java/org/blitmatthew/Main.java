package org.blitmatthew;

import org.blitmatthew.container.Box;
import org.blitmatthew.container.NumberBox;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(10);

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, I'm in a box");
        System.out.println(stringBox.getContent());

        NumberBox<Long> strBox = new NumberBox<Long>();

        System.out.println(checkIfArrayIsEmpty(numList));



    }

//    private static <T> boolean checkIfArrayIsEmpty(List<T> arrayToBeChecked) {
//        for (int i = 0; i < arrayToBeChecked.size(); i++) {
//            if(arrayToBeChecked.get(i) != null) {
//                return true;
//            }
//        }
//        return false;
//    }

    private static  boolean checkIfArrayIsEmpty(List<?> arrayToBeChecked) {
        for (int i = 0; i < arrayToBeChecked.size(); i++) {
            if(arrayToBeChecked.get(i) != null) {
                return true;
            }
        }
        return false;
    }
}