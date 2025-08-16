package com.sonu.zgenInterv;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Genpact {
    public static void main(String[] args) {
        String input[] = {"eat","team","tan","Hello"};

        List<String> collect = Arrays.stream(input).sorted(Comparator.comparing(s -> s.length())).collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = Arrays.stream(input).sorted(Comparator.comparing(s -> s.length())).sorted().collect(Collectors.toList());
        System.out.println(collect1);

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Collection<List<String>> annagram = Arrays.stream(strs).collect(Collectors.
                groupingBy(s -> Arrays.stream(s.toLowerCase().split("")).sorted().collect(Collectors.toList()))).values();
        System.out.println(annagram);
    }
}
