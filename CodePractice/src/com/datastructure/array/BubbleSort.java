package com.datastructure.array;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={5,4,1,2,9,7};
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
