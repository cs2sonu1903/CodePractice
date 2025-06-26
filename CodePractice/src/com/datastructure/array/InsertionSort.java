package com.datastructure.array;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={5,4,1,2,9,7};
        for (int i = 1; i < arr.length-1; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
