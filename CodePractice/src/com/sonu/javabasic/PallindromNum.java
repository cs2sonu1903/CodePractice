package com.sonu.javabasic;

import java.util.Scanner;

public class PallindromNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();
        if (isPallindrom(num))
            System.out.println(num +" is Palindrom");
        else
            System.out.println(num +" is not a Palindrom");

    }
    public static boolean isPallindrom(int num){
        int r,temp;
        int sum=0;
        temp=num;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if (temp==sum)
            return true;
        else return false;

    }
}
