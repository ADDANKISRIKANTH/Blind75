package org.example.Anagrams;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean getAnagram(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            char first = str1.charAt(i);
            if (map.containsKey(first)) {
                map.put(first, map.get(first) + 1);
            } else {
                map.put(first, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char second = str2.charAt(i);
            if (map.containsKey(second) && map.get(second) > 0) {
                map.put(second, map.get(second) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        boolean value = getAnagram(str1,str2);
        System.out.println(value);
    }
}
