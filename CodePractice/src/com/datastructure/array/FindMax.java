package com.datastructure.array;

public class FindMax {
    public static void main(String[] args) {
        int [] arr={5,4,1,2,9,7};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum : "+max);

        int sMax=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>sMax && arr[i]<max){
                sMax=arr[i];
            }
        }
        System.out.println("Second max : "+sMax);
    }
}
