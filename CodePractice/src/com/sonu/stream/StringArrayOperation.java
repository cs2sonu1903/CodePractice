package com.sonu.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArrayOperation {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sonu");
        list.add("Rajesh");
        list.add("Amit");
        list.add("Steffi");
        list.add("Ashmita");
        System.out.println(list);

        list.stream().forEach(e -> System.out.println(e));

        //name start with
        List<String> aList = list.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(aList);

        //sorted list of string array
        List<String> sortList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortList);

        //convert list element to lowerCase
        list.stream().sorted().map(e -> e.toLowerCase()).forEach(System.out::println);
        System.out.println(list);

        //revese the element of list like : [Ashmita, Steffi, Amit, Rajesh, Sonu]
        List<String> revList = list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
            Collections.reverse(e);
            return e;
        }));
        System.out.println(revList);

        //reverse list element  like : [unoS, hsejaR, timA, iffetS, atimhsA]
        List<StringBuilder> revElem = list.stream().map(str -> new StringBuilder(str).reverse()).collect(Collectors.toList());
        System.out.println(revElem);


    }
}
