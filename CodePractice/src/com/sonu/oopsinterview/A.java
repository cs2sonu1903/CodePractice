package com.sonu.oopsinterview;

public interface A {
    default void doWork(){
        System.out.println("A Interface doWork Method");
    }
}
