package com.sonu.javabasic;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if(num <= 1)
            return false;
        for (int i=2; i*i<=num;i++){
            if(num % i==0)
                return false;
        }
        return true;
    }


}
