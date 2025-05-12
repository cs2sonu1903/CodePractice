package com.sonu.javabasic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First n number : ");
        int num = scanner.nextInt();
        int firstNum=0;
        int SecondNum=1;
        for(int i=0;i<num;i++){
           System.out.print(firstNum+" ");
           int nextnum=firstNum+SecondNum;
           firstNum=SecondNum;
           SecondNum=nextnum;

        }
    }

}
