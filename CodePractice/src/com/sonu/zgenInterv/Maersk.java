package com.sonu.zgenInterv;


import com.zmedium.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Maersk {
   /* List<Employee> list=new ArrayList<>();

    list.stream().filter(e->e.getDesg.equal("Manager")).sort(Comparator.comparing(Employee::geNname)).collect(Collectors.toList());*/
   public static void main(String[] args) {
       int []arr={1, 2, 3, 1, 4, 5, 2, 6};

   /*    Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
               .entrySet().stream().filter(e->e.getValue()>1).map(s->s.getKey()).forEach(System.out::println);*/

       for (int i = 0; i <arr.length ; i++) {
           for (int j = 0; j <arr.length ; j++) {
               if(i!=j && arr[i]==arr[j]){
                   System.out.println(arr[i]);
               }
           }
       }

       int a=213;

      

   }


}
