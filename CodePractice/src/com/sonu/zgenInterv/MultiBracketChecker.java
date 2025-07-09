package com.sonu.zgenInterv;

import java.util.Stack;

public class MultiBracketChecker {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check for correct matching pair
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // True if all brackets are matched
    }

    public static void main(String[] args) {
        String input = "abcfgio(([{}]))";
        System.out.println("Is balanced: " + isBalanced(input)); // Output: true
    }
}
