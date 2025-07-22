package com.sonu.zgenInterv;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IndusTech {
    public static void main(String[] args) {
       /* List<Amount> amounts = List.of(
                new Amount(BigDecimal.valueOf(1.0)),
                new Amount(BigDecimal.valueOf(2.0)),
                new Amount(BigDecimal.valueOf(3.0))
        );*/
       int[] a={4,7,6,74,5,6};

       Arrays.stream(a).sum();

        Map<Integer, Long> occ = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occ);
    }
}
