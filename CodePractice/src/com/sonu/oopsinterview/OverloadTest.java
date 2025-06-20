package com.sonu.oopsinterview;

public class OverloadTest {
    public void method1(String s){
        System.out.println("String Method Called.....");
    }
    public void method1(Object obj){

        System.out.println("Object Method Called.....");
    }

    public static void main(String[] args) {
        OverloadTest overloadTest=new OverloadTest();
        //check with null
        overloadTest.method1(null);
    }
}
