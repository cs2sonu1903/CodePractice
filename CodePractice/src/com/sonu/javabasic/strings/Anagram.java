package com.sonu.javabasic.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean result = isAnagram(a, b);
        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function

        if(a.length()==b.length()){
            char[] aChar=a.toLowerCase().toCharArray();
            char[] bChar=b.toLowerCase().toCharArray();
            sortCharArray(aChar);
            System.out.println();
            sortCharArray(bChar);
            System.out.println();
            if(Arrays.equals(aChar, bChar)){
                return true;
            }


        }

        return false;

    }
    static char[] sortCharArray(char[] ch){
        for (int i = 0; i <ch.length-1; i++) {
            for (int j = i+1; j <ch.length ; j++) {
                if (ch[i]<ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;

                }
            }

        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        return ch;
    }
}
