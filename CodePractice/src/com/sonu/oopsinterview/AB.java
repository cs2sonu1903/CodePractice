package com.sonu.oopsinterview;

public interface AB {
    default void doWork(){
        System.out.println("AB Interface doWork Method");
    }
}
