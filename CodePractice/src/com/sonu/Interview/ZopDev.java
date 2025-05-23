package com.sonu.Interview;

import java.util.HashMap;

public class ZopDev {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> mapst=new HashMap<>();
        HashMap<Character,Character> mapts=new HashMap<>();

        for (int i = 0; i <s.length() ; i++) {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if (mapst.containsKey(ch1)) {
                if (mapst.get(ch1)!=ch2)
                    return false;
                
            }else {
                mapts.put(ch1,ch2);
            }
            if (mapst.containsKey(ch2)) {
                if (mapst.get(ch2)!=ch1)
                    return false;

            }else {
                mapts.put(ch2,ch1);
            }
            
        }
        return true;

    }
    public static void main(String[] args) {

        String s="egg",t="add";

        ZopDev z=new ZopDev();
        boolean isomorphic = z.isIsomorphic(s, t);
        System.out.println(isomorphic);

    }
}
