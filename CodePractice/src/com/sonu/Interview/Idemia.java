package com.sonu.Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Idemia {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Sonu","Kumar","Sonu","Dubey","Rajesh","Kumar");

        //with stream api
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //without stream api

        // Use a map to count occurrences
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String name : list) {
            frequencyMap.put(name, frequencyMap.getOrDefault(name, 0) + 1);
        }

        // Lists for repeated and unique strings
        List<String> repeated = new ArrayList<>();
        List<String> unique = new ArrayList<>();

        System.out.println("String counts:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            if (entry.getValue() > 1) {
                repeated.add(entry.getKey());
            } else {
                unique.add(entry.getKey());
            }
        }
        System.out.println("\nRepeated Strings: " + repeated);
        System.out.println("Unique Strings: " + unique);
    }
}
