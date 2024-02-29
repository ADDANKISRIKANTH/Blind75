package org.example.firstUniqueChars;

import java.util.HashMap;
import java.util.Map;

public class FirstuniqueChars {

    public static int getFirstUniqueChars(String str){

        Map<Character,Integer> map = new HashMap<>();
        char ch = str.charAt(0);
        for(int i=0; i<str.length(); i++){

            ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(int i=0; i<str.length(); i++){
            char chs = str.charAt(i);
            if(map.get(chs) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "leetcode";
        int value = getFirstUniqueChars(str);
        System.out.println(value);
    }
}
