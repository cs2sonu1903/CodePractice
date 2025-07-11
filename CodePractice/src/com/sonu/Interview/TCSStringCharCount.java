package com.sonu.Interview;

public class TCSStringCharCount {
    public static void main(String[] args) {
        String str = "aabbbcddeeaaf";
        StringBuffer resultString=new StringBuffer();

        int count=1;
        for (int i = 1; i <str.length() ; i++) {
            if (str.charAt(i)==str.charAt(i-1)){
                count++;
            }else {
                resultString.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }

        resultString.append(str.charAt(str.length()-1)).append(count);
        System.out.println(resultString.toString());

    }
}
