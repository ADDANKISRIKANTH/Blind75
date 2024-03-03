package org.example.LongestSubString;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public static int getLongestSubString(String str){
        int ans=0;
        int i=0;
        Map<Character,Integer> map = new HashMap<>();

        for(int j=0; j<str.length();j++){

            char ch = str.charAt(j);

            if(map.containsKey(ch)){

                while(i<str.length() && map.containsKey(ch)){
                    map.remove(str.charAt(i));
                    i++;
                }
            }
            map.put(ch,j);
            ans = Math.max(j-i+1,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int k = getLongestSubString(str);
        System.out.println(k);
    }
}
