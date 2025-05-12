package com.sonu.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWith {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(16);
        list.add(18);
        list.add(50);
        list.add(55);
        list.add(57);
        list.add(33);
        System.out.println(list);

        List<String> collect = list.stream().map(s -> s + "").filter(l -> l.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
