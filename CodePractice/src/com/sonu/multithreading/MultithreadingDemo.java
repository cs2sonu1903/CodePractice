package com.sonu.multithreading;

public class MultithreadingDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Thread:  ....");

    }



    public static void main(String[] args) {
        MultithreadingDemo mt=new MultithreadingDemo();
        Thread th=new Thread(mt);
        th.start();
        Thread th2=new Thread(mt);
        th2.start();
    }
}
