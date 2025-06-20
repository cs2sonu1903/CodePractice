package com.sonu.Interview.Array;

public class WissenTest2 {
    public static void main(String[] args) {
        int arr[]={3,2,5,6,-1};
        for (int i = 0; i <arr.length ; i++) {
            int leftSum=0,rightSum=0;
            for (int j = 0; j < i; j++) {
                leftSum+=arr[j];
            }
            for (int j = i+1; j <arr.length ; j++) {
                rightSum+=arr[j];
            }
            if (leftSum==rightSum)
                System.out.println(i);
        }
    }
}
