package com.sonu.stream.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OcceranceInString {
    public static void main(String[] args) {
        String s = "I am learning Java Stream Api Java Programming";
        String s2="Hello Word!";

        System.out.println(s);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Occerance of each word in String");

        Map<String, Long> collect = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Occerance of each character in String");
        Map<String, Long> occChar = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occChar);

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("specific no of voial is present in word");
        Arrays.stream(s.split(" ")).filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 2).forEach(System.out::println);

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Find the first non repeating character in string");
        String s1 = Arrays.stream(s.split("")).filter(c -> s.indexOf(c) == s.lastIndexOf(c)).findFirst().get();
        System.out.println(s1);

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Find the first repeating character in string");
        Character c1 = s2.chars().mapToObj(e -> (char) e).collect(Collectors.toMap(c -> c, c -> 1, Integer::sum, HashMap::new)).entrySet().stream()
                .filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst().get();
        System.out.println(c1);
        //2nd way
        Character c2 = s.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() > 1).map(m -> m.getKey()).findFirst().get();
        System.out.println(c2);
        System.out.println("Test");


    }
}

