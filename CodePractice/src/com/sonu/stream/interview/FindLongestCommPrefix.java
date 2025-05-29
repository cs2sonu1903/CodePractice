package com.sonu.stream.interview;

import java.util.Arrays;
import java.util.List;

public class FindLongestCommPrefix {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Flower", "flow", "Flat");
        String s = list.stream().map(e->e.toLowerCase()).reduce((s1, s2) -> {
            int i = 0;
            while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) i++;
            return s1.substring(0, i);
        }).orElse("");
        System.out.println(s);

    }
}
