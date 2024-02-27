package org.example.commonPrefix;

import java.util.Arrays;

public class MostCommonPrefix {

    public static String longestCommonPrefix(String [] str){
        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length - 1];
        int i=0;
        while(i<first.length() &&  i < last.length()){
            if(first.charAt(i) == last.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return first.substring(0,i);
    }

    public static void main(String[] args) {
        String [] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));

    }
}
