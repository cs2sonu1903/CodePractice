package com.sonu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbStartWith {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 18, 20, 22, 24, 17);

        List<String> collect = list.stream().map(n -> n + "").filter(e -> e.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
