package com.sonu.stream.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Annagram {
    public static void main(String[] args) {
        String[] s={"pat","tap","pan","nap","Team","tree","meat"};

        List<String> list = Arrays.asList(s);
        Collection<List<String>> collect = list.stream().collect(Collectors
                .groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted()
                .collect(Collectors.toList()))).values();
        System.out.println(collect);
    }
}
/*
* 62. Unique Paths
Medium
Topics
premium lock icon
Companies
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.

 
* */