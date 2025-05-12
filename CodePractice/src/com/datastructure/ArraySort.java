package com.datastructure;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("......Enter the size of Array.....");
        int n=scanner.nextInt();
        System.out.println("......Enter the array element.....");
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=scanner.nextInt();
        }

        mergesort(arr);

    }

    private static void mergesort(int[] arr) {
    }
}
