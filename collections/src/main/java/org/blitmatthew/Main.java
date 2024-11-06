package org.blitmatthew;

import org.blitmatthew.entity.Demon;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        //List
       List<Integer> numList = new ArrayList<>();
       numList.add(null);
       numList.add(null);
       numList.add(10);
       numList.add(20);
       numList.add(20);
       numList.remove(1);
        System.out.println(numList.get(2));
        numList.set(0, 60);
        System.out.println(numList);
        System.out.println(numList.size());
        numList.sort(Integer::compareTo);
        System.out.println(numList.contains(30));
        System.out.println(numList);
        numList.forEach(x -> System.out.println(x));
        System.out.println(numList.isEmpty());
        List<Integer> numLinkedList = new LinkedList<>();

        List<List<Integer>> listListNum = new ArrayList<>();
        listListNum.add(numList);

        printArray(numList);
        printArray(listListNum);

        //Set
        Set<String> strSet = new HashSet<>();
        strSet.add("Hello");
        //This one will be dropped since it equals to the first
        strSet.add("Hello");
        System.out.println(strSet);

        System.out.println(strSet.contains("Lamb"));

        strSet.forEach(System.out::println);
        strSet.remove("Hello");
        System.out.println(strSet);

        Set<Demon> demons = new TreeSet<>();

        demons.add(new Demon("Fawad", "Top Level", 50, 100));
        demons.add(new Demon("Wilfred", "Mid-Level", 100, 50));
        demons.add(new Demon("Matthew", "Nineth Circle", 75, 150));
        demons.add(new Demon("Fatima", "HR", 85, 200));

        System.out.println(demons);

        Map<String, String> countries = new HashMap<>();
        countries.put("us", "United States");
        countries.put("br", "Brazil");
        countries.put("es", "Spain");
        System.out.println(countries);
        System.out.println(countries.get("es"));
        countries.remove("br");
        System.out.println(countries);
        countries.put("es", "Exandria");
        System.out.println(countries);
        System.out.println(countries.containsValue("Afghanistan"));
        System.out.println(countries.containsKey("af"));
        Map<String, String> hashTable = new Hashtable<>();
        Map<String, String> cocurrentHashMap = new ConcurrentHashMap<>();
    }

    static void printArray(List<?> array) {
        for (Object o : array) {
            System.out.println(o);
        }
    }
}