package org.example.firstLetterToTwise;

import java.util.HashMap;
import java.util.Map;

public class FirstLetterToTwise {

    public static char getFirstLtter(String str){

        Map<Character,Integer> map = new HashMap<>();
        char ch = str.charAt(0);
        for(int i=0; i<str.length();i++){

            ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

            if(map.get(ch) == 2){
                break;
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        String str = "abccd";
        char ch = getFirstLtter(str);
        System.out.println(ch);
    }
}
