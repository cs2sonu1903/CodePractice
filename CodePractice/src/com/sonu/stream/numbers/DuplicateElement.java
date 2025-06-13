package com.sonu.stream.numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
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
        list.add(55);
        list.add(57);
        list.add(33);
        System.out.println(list);
        Set<Integer> set = new HashSet();

        List<Integer> collect = list.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
        System.out.println(collect);

        //find the first element of the list

        list.stream().findFirst().ifPresent(System.out::println);

        //find the total number of elements present

        long count = list.stream().count();
        System.out.println(count);

        //find the maximum value element present

        Integer i = list.stream().max(Integer::compareTo).get();
        System.out.println(i);
    }
}
