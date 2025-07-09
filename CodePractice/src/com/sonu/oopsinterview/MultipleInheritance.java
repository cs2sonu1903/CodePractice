package com.sonu.oopsinterview;

public class MultipleInheritance implements AB,A{

    @Override
    public void doWork() {
        A.super.doWork();
    }

    public static void main(String[] args) {
        MultipleInheritance mIn=new MultipleInheritance();
        mIn.doWork();
    }
}
