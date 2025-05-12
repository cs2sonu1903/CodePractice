package com.sonu.javabasic;

import java.util.Scanner;

public class palindromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=scanner.next();

        String revString="";
        int strlength=str.length();
        for (int i = strlength-1; i >=0 ; i--) {
            revString=revString+str.charAt(i);
        }
        if (str.equals(revString))
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");

    }
}
