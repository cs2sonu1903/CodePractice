package com.sonu.multithreading.bookseat;

public class Thread1 extends Thread{
    BookTheaterSeat b;
    int seats;
    Thread1(BookTheaterSeat b,int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookSeat(seats);
    }
}
