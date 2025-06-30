package com.sonu.stream.object;

import java.util.*;
import java.util.stream.Collectors;

public class ObjectTest {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Yanksha", 28, 1230, "F", "HR", "Blore", 2020));
        empList.add(new Employee(11, "Sonu", 28, 1330, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Francesca", 29, 1200, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Ramesh", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Melanie", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "Padma", 22, 1500, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Milad", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Uzma", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Ali", 23, 1450, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "Ram", 25, 160, "M", "IT", "Blore", 2010));

        System.out.println(empList);

        //Group the Employees by city.
        Map<String, List<Employee>> groupByCity = empList.stream().collect(Collectors.groupingBy(e -> e.getCity(), Collectors.toList()));
        System.out.println(groupByCity);

        //Group the Employees by age.
        System.out.println("Group the Employees by age");

//      Map<Integer, List<Employee>> groupByAge = empList.stream().collect(Collectors
//      .groupingBy(e -> e.getAge(), Collectors.toList()));
        Map<Integer, List<Employee>> groupByAge = empList.stream()
                .collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(groupByAge);

        //Find the count of male and female employees present in the organization
        System.out.println("count of male and female employees present in the organization");
        Map<String, Long> countByGender = empList.stream().collect(Collectors
                .groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countByGender);

        //Print the names of all departments in the organization
        System.out.println("Print the names of all departments in the organization");
        empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        //Print Average age of Male and Female Employees..
        System.out.println("Print Average age of Male and Female Employees.");
        Map<String, Double> avhAgeMF = empList.stream().collect(Collectors
                .groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avhAgeMF);

        //Print the number of employees in each department.
        System.out.println("Print the number of employees in each department.");
        Map<String, Long> noEachDept = empList.stream().collect(Collectors
                .groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println(noEachDept);

        //Find oldest employee by age
        System.out.println("Find oldest employee by age");
        Employee OldEmpoyee = empList.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.println(OldEmpoyee);

        //Find longest serving employees in the organization
        System.out.println("Find longest serving employees in the organization");
        Employee longSerEmployee = empList.stream().sorted(Comparator
                .comparing(Employee::getYearOfJoining)).findFirst().get();
        System.out.println(longSerEmployee);

        //Find longest serving employee in each department
        System.out.println("Find longest serving employee in each department");
        Map<String, Optional<Employee>> lomgServEachDep = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.minBy(Comparator
                        .comparing(Employee::getYearOfJoining))));
        System.out.println(lomgServEachDep);
        empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors
                        .minBy(Comparator.comparing(Employee::getYearOfJoining))))
                .forEach((dept,empOpt)->empOpt.ifPresent(emp->System.out.
                        println(dept+" -> "+emp.getName()+" ( DOJ : "+emp.getYearOfJoining()+")")));

        //Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees.
        System.out.println("Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees.");
        empList.stream().filter(e->e.getCity().equalsIgnoreCase("Blore"))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(emp->System.out.println("Employee staing in the city Blore ::"+ emp.getName()));

        //Sorting a Stream by age and name fields
        System.out.println("Sorting a Stream by age and name fields");
        Comparator<Employee> comprator1 = Comparator.comparing(Employee::getName);
        Comparator<Employee> comprator2 = Comparator.comparing(Employee::getAge);
        empList.stream().sorted(comprator1.thenComparing(comprator2)).forEach(System.out::println);

        //Print average and total salary of the organization.
        System.out.println("Print average and total salary of the organization.");
        double avgSal = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getAverage();
        System.out.println("Avg salary : "+avgSal);
        double salSum = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
        System.out.println("Total salary : "+salSum);

        //Find the emp who is earning more then 1000 and and store in the map where key is city and value is the list of employee present in that city
        System.out.println("Cognizent");
        Map<String, List<String>> collect = empList.stream()
                .filter(e -> e.getSalary() > 1000).collect(Collectors.
                        groupingBy(emp -> emp.getCity(), Collectors.mapping(e -> e.getName(), Collectors.toList())));
        System.out.println(collect);
    }


}
