package com.sonu.javabasic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year= sc.nextInt();

        isleapYear(year);
    }

    private static void isleapYear(int year) {
        if (year % 4 ==0) {

            if (year % 100 != 0 || year % 400 == 0){
                    System.out.println(year+" is leap year");
            }
            else
                System.out.println(year+" is not a leap year");
        }
        else
            System.out.println(year+" is not a leap year");
    }
}
