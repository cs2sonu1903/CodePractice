package com.sonu.multithreading;

public class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println("4 X "+i+" = "+4*i);
           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        MyThread3 myTh=new MyThread3();
        myTh.start();
    }
}
