package com.sonu.multithreading.bookseat;

public class MySeatBook {
    public static void main(String[] args) {
        BookTheaterSeat b1=new BookTheaterSeat();
        Thread1 th1=new Thread1(b1,7);
        th1.start();
        Thread2 th2=new Thread2(b1,5);
        th2.start();


    }
}
