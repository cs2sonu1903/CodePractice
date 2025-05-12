package com.sonu.java8.stream.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tcs {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Red");
        list.add("Yellow");
        list.add("Black");
        list.add("pink");

        System.out.println(list);

        List<String> collect = list.stream().filter(i -> i.equals("Yellow")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
