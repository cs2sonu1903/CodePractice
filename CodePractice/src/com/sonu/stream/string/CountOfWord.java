package com.sonu.stream.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfWord {
    public static void main(String[] args) {
        String[] str = {"java Ruby struts", "spring java", "spring python"};

        long count = Arrays.stream(str).flatMap(s -> Arrays.stream(s.split(" "))).filter(s1 -> s1.equalsIgnoreCase("spring")).count();
        System.out.println(count);

        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6, 4};

        Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(collect);

        int[] arr2 = {1, 2, 3, 2, 4, 5,5, 1, 6, 4};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr2) {
            if (!seen.add(num)) {
                // If add fails (already in set), it's a duplicate
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
