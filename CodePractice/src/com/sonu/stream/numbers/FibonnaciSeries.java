package com.sonu.stream.numbers;

import java.util.stream.Stream;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Stream.iterate(new long[]{0,1}, fib->new long[]{fib[1],fib[0]+fib[1]})
                .limit(10).map(n->n[0]).forEach(System.out::println);
    }
}
