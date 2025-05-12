package com.sonu.Interview.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Wissen1Array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Array length");
        int n=scanner.nextInt();
        System.out.println("Enter The Array Elements..");
        int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.stream(arr).sorted();

        int[] updateSeq=performanceSeq(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] performanceSeq(int[] arr, int n) {
//        int[] updateArr=new int[n];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <arr[i+1]) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i++;
            }
        }

//        return updateArr;
        return arr;
    }
}
