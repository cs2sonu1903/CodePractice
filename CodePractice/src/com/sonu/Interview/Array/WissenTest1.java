package com.sonu.Interview.Array;

public class WissenTest1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length-1; i++) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration/1_000_00);
    }
}
