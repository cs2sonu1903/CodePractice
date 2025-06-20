package com.sonu.basicInterface;

public interface Interface2 {
    abstract void m1();

    default void m2(){
        int a=5,b=4,result;
        result=a+b;
        System.out.println(result);
    }
}
