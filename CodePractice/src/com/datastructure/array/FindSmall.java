package com.datastructure.array;

public class FindSmall {
    public static void main(String[] args) {
        int [] arr={5,4,1,2,9,7};
        int small=Integer.MAX_VALUE;
        int sSmal=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <small){
                sSmal = small;
                small =arr[i];
            }else if (arr[i] >small && arr[i]<sSmal){
                sSmal = arr[i];
            }

        }
        System.out.println(sSmal);
    }
}
