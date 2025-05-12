package com.sonu.stream;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "I am a good Stream API Programmer";
        String s = "dacbadefg";
        System.out.println(str);
        System.out.println(s);
        System.out.println("----------------------------------------------------------------");

        System.out.println("Find the  highest lenth word");
        String highLenWord = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(highLenWord);
        //remove duplicate
        System.out.println("----------------------------------------------------------------");
        System.out.println("Remove Duplicate from the string");
        s.chars().distinct().mapToObj(e->(char)e).forEach(System.out::print);
        System.out.println();
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Find the Second highest lenth word");
        String ans = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();
        System.out.println(ans);
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Find the length of Second highest lenth word");
        Integer i = Arrays.stream(str.split(" ")).map(e -> e.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);

    }
}
