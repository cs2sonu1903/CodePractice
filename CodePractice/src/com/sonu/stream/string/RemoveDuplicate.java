package com.sonu.stream.string;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="babbcdef";
        //1st way
        s.chars().distinct().mapToObj(e->(char)e).forEach(System.out::print);
        System.out.println();
        //2nd way
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
