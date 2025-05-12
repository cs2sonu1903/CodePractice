package com.sonu.multithreading;

public class MyThreadMain {
   /* @Override
    public void run() {
        System.out.println("Run Method is running...");
        System.out.println(Thread.currentThread().getName());
    }*/

    public static void main(String[] args) {
        MyThreadMain myThreadMain=new MyThreadMain();
        System.out.println("My Thread");
//        Thread mth=new Thread(myThreadMain);
//        mth.start();
        MyThread1 mt1 = new MyThread1();
        mt1.start();
//        Thread th1=new Thread(mt1);
//        th1.start();
//        System.out.println(Thread.currentThread().getName());
        MyThread2 mt2=new MyThread2();
        mt2.start();
//        Thread th2=new Thread(mt2);
//        th2.start();
        MyThread3 mt3=new MyThread3();
        mt3.start();
//        Thread th3=new Thread(mt3);
//        th3.start();

    }

}
