package com.sonu.exception;

public class GridTech {
    public static void main(String[] args) {
        int n=1;
        recursive(n);
    }
    public static void recursive(int n){
        while (n>0){
            recursive(n+1);//StackOverflowError
            System.out.println("Hi..");
        }
    }
}
