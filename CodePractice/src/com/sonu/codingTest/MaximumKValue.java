package com.sonu.codingTest;

import java.util.HashMap;
import java.util.Map;

public class MaximumKValue {
    public int maxKValue(int input1, int[] input2) {
        // Step 1: Count the frequency of each element in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : input2) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the greatest common divisor (GCD) of all frequencies
        int gcd = 0;
        for (int frequency : frequencyMap.values()) {
            gcd = findGCD(gcd, frequency);
        }

        // The GCD of the frequencies is the maximum K value
        return gcd;
    }

    // Helper method to calculate the GCD of two numbers
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        MaximumKValue solution = new MaximumKValue();

        // Test case 1
        int input1 = 6;
        int[] input2 = {1, 2, 1, 3, 2, 3};
        System.out.println(solution.maxKValue(input1, input2)); // Output: 3

        // Test case 2
        input1 = 5;
//         input2 = {1, 2, 3, 5, 4};
        System.out.println(solution.maxKValue(input1, input2)); // Output: 5
    }
}

/*
Maximum K Value

While playing a game, your friend presents you with a mathematical challenge involving an array A of size N. You are allowed to rearrange the array in any way and then divide it into smaller, contiguous pieces (if needed), ensuring that each piece meets the following conditions:

1. Suppose you rearranged the array as (A1, A2, A3, A4, A5, A6 AN). You then break the array in K segments as (S1, S2, S3, ..., Sx). S₁ should contain elements (A[1], A[2], ..., A[x]), S2 should contain elements (A[x+1], A[x+2], ..., A[y]), and so on.

2. All sequences, including S1, S2, S3, etc., must have identical sizes and share the same elements and their respective order.

3. K should be maximum as possible

Your task is to find and return an integer value denoting the size of any sequence of the array.

Input Specification:

input1: An integer value N, representing the size of the array.

input2: An integer array A

Output Specification:
Example 1:

input1: 6

input2: (1,2,1,3,2,3)

Output: 3
*/
