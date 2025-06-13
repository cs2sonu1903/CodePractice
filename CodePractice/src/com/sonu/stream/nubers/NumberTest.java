package com.sonu.stream.nubers;

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

        //Find even no from the list
      List<Integer> evenList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        //find the odd no from the list
        List<Integer> oddList=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(oddList);

        //bigger then 10
        List<Integer> biggerthen10=list.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(biggerthen10);

        //Squire of the number
        List<Integer> squire=list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(squire);

        //even squire
        List<Integer> squireEven=list.stream().map(i->i*i).filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(squireEven);

        //sorted squire of the arraylist
        List<Integer> sortedSquire = list.stream().sorted().map(i -> i * i).collect(Collectors.toList());
        System.out.println(sortedSquire);

        //sorted even squire
        List<Integer> sortevenSquire = list.stream().sorted().map(i -> i * i).filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(sortevenSquire);

        //Aniother list
        List<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(250);
        list1.add(377);
        list1.add(947);
        list1.add(847);
        list1.add(846);
        list1.add(432);

        System.out.println(list1);

        //append charecter in list
        List<String> collect = list1.stream().sorted().map(i -> i.toString()).map(i->i+'A').collect(Collectors.toList());
        System.out.println(collect);

        //reverse the string
        List<StringBuilder> collect1 = collect.stream().map(i -> new StringBuilder(i).reverse()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
