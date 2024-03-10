package org.example.mostTwoDistinctChar;

import java.util.HashMap;
import java.util.Map;

public class MostTwoDistinctCharacter {

    public static int getMostTwoDistinctChar(String str){

        int j=0;
        int ans=0;
        Map<Character,Integer> map = new HashMap<>();
        char ch;

        for(int i=0; i< str.length(); i++){

            ch = str.charAt(i);
            if(map.size() <=2){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }
            }


            if(map.size() >2){

                char p = str.charAt(j);
                while(map.size() > 2){

                    if(map.get(p) == 1){
                        map.remove(p);
                    }else{
                        map.put(p,map.get(p)-1);
                    }
                    j++;

                }
            }

            ans = Math.max(i-j+1,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "abbbbacc";
        int k = getMostTwoDistinctChar(str);
        System.out.println(k);
    }
}
