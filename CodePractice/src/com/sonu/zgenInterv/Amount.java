package com.sonu.zgenInterv;

import java.util.Scanner;

public class Amount {
    public static String StringChallenge(String[] strArr) {
        String inputString = strArr[0];
        String regex = "^\\d{1,3}(,\\d{3})*(\\.\\d+)?$";
        // The matches() method returns a boolean. Convert it to a String.
        return String.valueOf(inputString.matches(regex));
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String inputLine = s.nextLine();
        // The StringChallenge method now returns a String.
        String result = StringChallenge(new String[]{inputLine});
        System.out.println(result);
        s.close();
    }
}
