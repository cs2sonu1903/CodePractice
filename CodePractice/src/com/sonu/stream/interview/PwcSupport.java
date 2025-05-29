package com.sonu.stream.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{
    String name;
    int salary;
    List<Address> addresses;

    public Employee1(String name, int salary, List<Address> addresses) {
        this.name = name;
        this.salary = salary;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", addresses=" + addresses +
                '}';
    }
}

public class PwcSupport {
    public static void main(String[] args) {
        List<Employee1> listOfEmp = Arrays.asList(
                new Employee1("abd", 10000, Arrays.asList(new Address("Mayur Bihar", "Delhi","Delhi"))),
                new Employee1("sahu", 170000, Arrays.asList(new Address("WhiteField","Bangalore", "Karnataka"))),
                new Employee1("sneha", 130000, Arrays.asList(new Address("Hinzevada","Pune", "Maharashtra")))
        );
        System.out.println(listOfEmp);

        List<String> collect = listOfEmp.stream().flatMap(e -> e.addresses.stream().map(add->e.name+"   "+ add.getCity())).collect(Collectors.toList());
        System.out.println(collect);

    }
}
