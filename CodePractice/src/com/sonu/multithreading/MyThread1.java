package com.sonu.multithreading;

public class MyThread1 extends Thread {
    static Thread mainTjread;
    @Override
    public void run() {
       /* try {
            mainTjread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        for (int i = 1; i <=10; i++) {
            System.out.println("2 X "+i+" = "+2*i);
           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
        System.out.println("------------------------------");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 th1=new MyThread1();
        th1.start();
        mainTjread = Thread.currentThread();
//        th1.join();
        for (int i = 1; i <=10 ; i++) {
            System.out.println("maim Thread : "+i);

        }

    }
}
