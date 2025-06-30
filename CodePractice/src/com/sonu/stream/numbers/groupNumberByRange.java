package com.sonu.stream.numbers;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupNumberByRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 11, 56, 15, 24, 29, 34, 65, 6, 44, 49, 55, 64, 20};
        Map<Integer, List<Integer>> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(e -> e / 10 * 10, LinkedHashMap::new,Collectors.toList()));
        System.out.println(collect);

    }
}
