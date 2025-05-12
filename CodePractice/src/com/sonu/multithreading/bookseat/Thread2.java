package com.sonu.multithreading.bookseat;

public class Thread2 extends Thread{
    BookTheaterSeat b;
    int seats;
    Thread2(BookTheaterSeat b,int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookSeat(seats);
    }

}
