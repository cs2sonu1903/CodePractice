package com.sonu.basicInterface;

public class MultiInheritTest implements Interface1 ,Interface2{
    @Override
    public void m1() {
        System.out.println("Chutiyapa test");

    }

    public static void main(String[] args) {
        MultiInheritTest m=new MultiInheritTest();
        m.m1();
        m.m2();

    }
}
