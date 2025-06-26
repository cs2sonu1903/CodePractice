package com.sonu.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IndiumRevStringWord {
    public static void main(String[] args) {
        String s="My, name. is, Sonu";

        List<StringBuilder> collect = Arrays.stream(s.split(" ")).map(e -> new StringBuilder(e).reverse()).collect(Collectors.toList());
        System.out.println(collect);
        String collect1 = Arrays.stream(s.split(" ")).map(e -> e.matches("[a-zA-Z]+") ? new StringBuilder(e).reverse() : e).collect(Collectors.joining());
        System.out.println(collect1);

        //chat gpt
        String result = Arrays.stream(s.split("(?<=\\W)|(?=\\W)")) // Split keeping punctuation
                .map(token -> token.matches("\\w+") ? new StringBuilder(token).reverse().toString() : token)
                .collect(Collectors.joining());

        System.out.println(result); // Output: yM, eman. si, unoS
    }
}
