package com.sonu.Interview.Array;

import java.util.Scanner;

public class Wissen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array length");
        int n = scanner.nextInt();
        System.out.println("Enter The Array Elements..");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        int arr[]={3,2,5,1,4};
        int sumMidIndex=sumMidPoint(arr);
        System.out.println("Sum Mid point index "+sumMidIndex);

    }

    private static int sumMidPoint(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return i;
            }

        }
        return 0;
    }
}
