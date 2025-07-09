package com.sonu.zgenInterv;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grid {

  /*  i/p->abcdefabcd
    o/p->abcdef*/
  public static void main(String[] args) {
      String s="abcdefabcd";
      Map<String, Long> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      System.out.println(collect);
      int [] count=new int[256];
      for (int i = 0; i <s.length() ; i++) {
          count[s.charAt(i)]++;
      }
      for (int i = 0; i < count.length; i++) {
          if (count[i]>0){
              System.out.print((char) i+" "+count[i]+" ");
          }
      }

  }

}
