package com.sonu.javabasic;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string=sc.nextLine();
        String revStr="";
        for (int i = string.length()-1; i >=0 ; i--) {
            revStr=revStr+string.charAt(i);
        }
        System.out.println("Reverse String is : "+revStr);
    }
}
