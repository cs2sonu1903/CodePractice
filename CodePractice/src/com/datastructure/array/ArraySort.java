package com.datastructure.array;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("......Enter the size of Array.....");
        int n=scanner.nextInt();
        System.out.println("......Enter the array element.....");
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=scanner.nextInt();
        }*/
        int[] arr = {5, 2, 9, 1, 6};

       /* int[] bubblesort= bublesort(arr);

        for(int num:bubblesort)
        {
            System.out.print(" "+num);
        }
        */
        int[] insertionSort=insertionSort(arr);
        for (int num: insertionSort){
            System.out.print(" "+num);
        }

    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i <arr.length ; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }

    private static int[] bublesort(int[] arr) {
        for (int i = 0; i <arr.length-1; i++) {
            boolean swapped=false;
            for (int j = 0; j <arr.length-1-i; j++) {
                if (arr[j] >arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }

        }
        return arr;
    }
}
