package com.sonu.javabasic;

import java.util.Scanner;

public class PrimeCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int num = scanner.nextInt();
        int count=0;
        for (int i =1; i<=num; i++)
        {
            if(isPrime(i))
                count++;
            else
                continue;
        }
        System.out.println("No of Prime : "+count);

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
