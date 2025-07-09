package com.sonu;

public class TestCode {
    public static void main(String[] args) {
        //input arr 3,9,15,21,
        //target =24
        int [] arr ={3,9,15,21};
        int target=24;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }


    }
}
