package com.sonu.oopsinterview;

import com.sonu.stream.Employee;

public class EqualMethodOverride {
    public static void main(String[] args) {
        Employee emp1=new Employee("Sonu",45000,"Bengaluru");
        Employee emp2=new Employee("Sonu",45000,"Bengaluru");

        boolean equals = emp1.equals(emp2);
        System.out.println(equals);
    }
}
