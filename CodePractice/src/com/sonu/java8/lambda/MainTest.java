package com.sonu.java8.lambda;

public class MainTest {
    public static void main(String[] args) {
        //anonymous class
    /*    Addition addition=new Addition() {
            @Override
            public int add(int a, int b) {
                System.out.println("Test os anonymous class");
                return a+b;
            }
        };
       System.out.println(addition.add(5,8));*/

       //Using lambda
        Addition addition=(a,b)->a+b;
        System.out.println(addition.add(5,8));
        System.out.println(addition.add(3,7));
    }
}
