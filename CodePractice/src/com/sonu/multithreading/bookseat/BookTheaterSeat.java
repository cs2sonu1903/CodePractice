package com.sonu.multithreading.bookseat;

public class BookTheaterSeat {
    int totalSeat=10;

    void bookSeat(int seat){
        if (totalSeat >=seat) {
            System.out.println(" Seats booked Successfully...: "+seat);
            totalSeat=totalSeat-seat;
            System.out.println("Total seats left.. : "+ totalSeat);
        }else {
            System.out.println(seat+ ": Seats can not be booked");
            System.out.println(" seats left.. : "+ totalSeat);

        }
    }
}
