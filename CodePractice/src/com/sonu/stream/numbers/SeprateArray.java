package com.sonu.stream.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeprateArray {
    public static void main(String[] args) {
        int[] arr={4,5,7,9,2,6,1,4,7,9};

        Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()));
        System.out.println(collect);

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Rearrange the number from lower to higher");
        Arrays.stream(arr).boxed().sorted().forEach(System.out::print);
        System.out.println();
        System.out.println("Rearrange the number from higher to lower");
        Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::print);

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Sum of unique elements");
        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);
    }
}
