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
        int sumMidIndex=sumMidPoint(arr);
        System.out.println("Sum Mid point index "+sumMidIndex);

    }

    private static int sumMidPoint(int[] arr) {
        int leftSum=0,rightSum=0,index=0;
        for (int i = 0; i <arr.length; i++) {
            leftSum=leftSum+arr[i];
            for (int j = i+1; j <arr.length-1 ; j++) {
                rightSum=rightSum+arr[j];
                continue;
            }
            if (leftSum == rightSum) {
                index=arr[i];

            }

        }
        return index;
    }
}
