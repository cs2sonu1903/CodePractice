package com.sonu.Interview.Array;

import java.lang.reflect.Array;

public class Deloite {
    public static void main(String[] args) {
        int[] arr={3,5,8,4,6,7,9,2,1,6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println(Array.get(arr,1));
    }
}
