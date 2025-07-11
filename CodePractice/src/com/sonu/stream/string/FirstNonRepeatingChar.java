package com.sonu.stream.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="Divyanshu bhaiya bahut fattu hai";

        //Find 1st non repeating character
        Character c1 = str.chars().mapToObj(c -> (char) c).filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(c1);
        String nonRepFst = Arrays.stream(str.split("")).filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(nonRepFst);


        //find the first repeated character
        Set<Character> seenCharacters = new HashSet<>();
        Character c2 = str.chars().mapToObj(c -> (char) c).filter(c -> !seenCharacters.add(c)).findFirst().orElse(null);
//        String repFirsCh = Arrays.stream(str.split("")).filter(ch -> !seenCharacters.add(ch)).findFirst().orElse(null);
//        System.out.println(repFirsCh);
        System.out.println(c2);
    }
}
