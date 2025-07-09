package com.zmedium;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTestObj {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Yanksha", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Francesca", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Ramesh", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Melanie", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "Padma", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Milad", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Uzma", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Ali", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "Ram", 25, 160, "M", "IT", "Blore", 2010));

        System.out.println(empList);

        //Group the Employees by city.
        Map<String, List<Employee>> groupByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(groupByCity);

        //Group the Employees by age.
        Map<Integer, List<Employee>> groupByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(groupByAge);

        //Find the count of male and female employees present in the organization.
        Map<String, Long> mFcount = empList.stream().collect(Collectors
                .groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(mFcount);

        //Find the count of male and female present in each department
        Map<String, Map<String, Long>> groupByDepAndContMF = empList.stream().collect(Collectors
                .groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        System.out.println(groupByDepAndContMF);

        //Print the names of all distinct departments in the organization.
        empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        //Print employee details whose age is greater than 28 in the organisation.
        empList.stream().filter(e->e.getAge()>28).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();

        //Find maximum age/oldest of employee in the organisation.

        Employee maxAge = empList.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.println(maxAge);

        //Print Average age of Male and Female Employees in the organisation.
        Map<String, Double> avgAgeMF = empList.stream().collect(Collectors.
                groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        System.out.println(avgAgeMF);

        //Print Average age of Male and Female Employees in each department.
        Map<String, Map<String, Double>> avgAgeOfMFByDep = empList.stream().collect(Collectors
                .groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingInt(Employee::getAge))));
        System.out.println(avgAgeOfMFByDep);

        //Print the number of employees in each department.
        Map<String, Long> noEmpEachDep = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println(noEmpEachDep);
    }
}
