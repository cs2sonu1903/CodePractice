package com.sonu.Interview;

import java.util.Scanner;

public class ZopDev2 {
    public boolean isPerfectSquare(int num){
        if (num < 1) return false;
        long left = 1;
        long right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        ZopDev2 zd=new ZopDev2();
        boolean perfectSquare = zd.isPerfectSquare(num);
        System.out.println(perfectSquare);
    }
}
