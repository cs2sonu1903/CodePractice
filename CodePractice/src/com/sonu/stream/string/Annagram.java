package com.sonu.stream.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Annagram {
    public static void main(String[] args) {
        String[] s={"pat","tap","pan","nap","Team","tree","meat"};

        List<String> list = Arrays.asList(s);
        Collection<List<String>> collect = list.stream().collect(Collectors.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted()
                .collect(Collectors.toList()))).values();
        System.out.println(collect);
    }
}
