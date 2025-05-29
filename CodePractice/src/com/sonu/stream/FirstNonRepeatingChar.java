package com.sonu.stream;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="Divyanshu bhaiya bahut fattu hai";
        Character c1 = str.chars().mapToObj(c -> (char) c).filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(c1);


        //find the first repeated character
        Set<Character> seenCharacters = new HashSet<>();
        Character c2 = str.chars().mapToObj(c -> (char) c).filter(c -> !seenCharacters.add(c)).findFirst().orElse(null);
        System.out.println(c2);
    }
}
