package com.datastructure.array;

import java.util.Arrays;

import static com.sun.deploy.net.MessageHeader.merge;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6,9,4,3};

        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();

       mergeSort(arr);
       for (int i:arr){
           System.out.print(i+" ");
       }
    }
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length]; // Auxiliary array for merging
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low < high) { // Base case: if low == high, subarray has 1 element, already sorted
            int mid = low + (high - low) / 2; // Avoids overflow for very large arrays

            // Recursively sort the first and second halves
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid + 1, high);

            // Merge the sorted halves
            merge(arr, temp, low, mid, high);
        }
    }

    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        // Copy elements from arr to temp for merging
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int i = low;       // index for left subarray (in temp)
        int j = mid + 1;   // index for right subarray (in temp)
        int k = low;       // index for merged array (in arr)

        // Compare elements from temp[low...mid] and temp[mid+1...high]
        // and place the smaller one into arr[k++]
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        // Copy remaining elements of left subarray (if any)
        // No need to copy remaining elements of right subarray, as they are already in place
        // in 'arr' relative to their sorted position from 'temp'
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
    }

}
