package org.example.arrays.Anagrams;

import java.util.Arrays;

public class Anagrams {
    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        Arrays.sort(chs);
        Arrays.sort(cht);

        for(int i=0; i<s.length(); i++){

            if(chs[i] != cht[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if (isAnagram(s, t)) {
            System.out.println("anagram");
        } else {
            System.out.println("not an anagram");
        }
    }
}
