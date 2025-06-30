package com.sonu.stream.numbers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class productofFirstNElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 11, 56, 15, 24, 29, 34};

        Integer multiple = Arrays.stream(arr).boxed().limit(4)
                .reduce(1, (a, b) -> a * b);
        System.out.println(multiple);

        //multiplication of alternative element of array

        int altMulRes = IntStream.range(0, arr.length).filter(a -> a % 2 == 0)
                .map(a -> arr[a]).reduce(1, (a, b) -> a * b);
        System.out.println(altMulRes);

    }
}
