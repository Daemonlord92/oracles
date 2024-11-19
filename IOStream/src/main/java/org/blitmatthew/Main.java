package org.blitmatthew;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        try (FileWriter fileWriter = new FileWriter("src/main/resources/example.txt")) {
//            fileWriter.write("Yaman is hopping around the room\n");
//            fileWriter.write("Fahima is passing out the flowers\n");
//            fileWriter.write("Fawad is suplexing Haqmal\n");
//            fileWriter.write("Matthew is starching his head\n");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try (FileReader fileReader = new FileReader("src/main/resources/example.txt");
//             BufferedReader reader = new BufferedReader(fileReader)) {
//            for(int i = 0; i < 6; i++) {
//                System.out.println(reader.readLine());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (FileWriter fileWriter = new FileWriter("src/main/resources/example.csv");
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            List<String[]> data = new ArrayList<>();
            data.add(new String[]{"Name", "Age", "City"});
            data.add(new String[]{"Matthew", "32", "Manassas Park"});
            data.add(new String[]{"Fawad", "25", "Char"});
            data.add(new String[]{"Yohannes", "18", "Auir"});
            for (String[] datum : data) {
                String csvRow = String.join(",", datum);
                writer.write(csvRow);
                writer.newLine();
            }
            System.out.println("CSV Created at src/main/resources/example.csv");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}