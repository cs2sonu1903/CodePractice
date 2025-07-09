package com.sonu.zgenInterv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DarshaCorp {
    public static void main(String[] args) {
        String s="Sonu Kumar";
        List<StringBuilder> collect = Arrays.stream(s.split("")).map(e -> new StringBuilder(s).reverse())
                .collect(Collectors.toList());
        System.out.println(collect);

        String newStr="";
        for (int i = s.length()-1; i >=0 ; i--) {
            newStr+=s.charAt(i);
        }
        System.out.println(newStr.toString());
        List<Integer> list=Arrays.asList(2,4,6,3,2,4);
        List<Integer> collect1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect1);
    }
}
