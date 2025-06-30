package com.slidingWindow;

import java.util.Arrays;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcdefabcd";
        System.out.println("Longest substring without repeating characters: " + longestUniqueSubstring(s));
    }

    private static String longestUniqueSubstring(String s) {
        int start = 0, maxLength = 0;
        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);

        int left=0;
        String result="";
        for (int right = 0; right < s.length(); right++) {
            char ch=s.charAt(right);
            if (lastSeen[ch]>=left){
                left=lastSeen[ch]+1;
            }
            lastSeen[ch]=right;
            if (right-left+1>maxLength){
                maxLength=right-left+1;
                result=s.substring(left,right+1);
            }
        }

        return result;
    }
}
