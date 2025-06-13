package com.sonu.stream.nubers;

import java.util.ArrayList;
import java.util.Arrays;
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

        //2nd

        List<Integer> nlist = Arrays.asList(10, 15, 18, 20, 22, 24, 17);

        List<String> ncollect = nlist.stream().map(n -> n + "").filter(e -> e.startsWith("1")).collect(Collectors.toList());
        System.out.println(ncollect);
    }
}
