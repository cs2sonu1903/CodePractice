package com.sonu.zgenInterv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Pallet {
    public static void main(String[] args) {
        int [][] arr={{1, 3}, {2, 4}, {3, 5}, {7, 9}};

        // Step 1: Sort the intervals based on the start time
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Merge overlapping intervals
        for (int[] interval : arr) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Step 3: Find the gaps between merged intervals
        List<int[]> gaps = new ArrayList<>();
        for (int i = 1; i < merged.size(); i++) {
            int prevEnd = merged.get(i - 1)[1];
            int currStart = merged.get(i)[0];
            if (currStart > prevEnd) {
                gaps.add(new int[]{prevEnd, currStart});
            }
        }

        // Step 4: Print non-overlapping ranges
        for (int[] gap : gaps) {
            System.out.println("[" + gap[0] + ", " + gap[1] + "]");
        }
    }
}
