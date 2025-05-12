package com.sonu.multithreading;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println("3 X "+i+" = "+3*i);
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        MyThread2 th2=new MyThread2();
        th2.start();
    }
}
