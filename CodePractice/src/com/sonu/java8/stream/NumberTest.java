package com.sonu.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberTest {
    public static void main(String[] args) {

//       List<Integer> list=List.of(2,4,7,18,21,79,50);
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(50);
        list.add(55);
        list.add(57);
        list.add(33);
        System.out.println(list);

      List<Integer> evenList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenList);
        List<Integer> oddList=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(oddList);
        List<Integer> biggerthen10=list.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(biggerthen10);
        List<Integer> squire=list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(squire);
        List<Integer> squireEven=list.stream().map(i->i*i).filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(squireEven);
        List<Integer> sortedSquire = list.stream().sorted().map(i -> i * i).collect(Collectors.toList());
        System.out.println(sortedSquire);
        List<Integer> sortevenSquire = list.stream().sorted().map(i -> i * i).filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(sortevenSquire);

        List<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(250);
        list1.add(377);
        list1.add(947);
        list1.add(847);
        list1.add(846);
        list1.add(432);

        System.out.println(list1);
        List<String> collect = list1.stream().sorted().map(i -> i.toString()).map(i->i+'A').collect(Collectors.toList());
        System.out.println(collect);
        List<StringBuilder> collect1 = collect.stream().map(i -> new StringBuilder(i).reverse()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
