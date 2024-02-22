package org.example.Anagrams;

import java.util.*;

public class GroupAnagrams {
    private static List<List<String>> getGroupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedArray = String.valueOf(charArray);
            if (!map.containsKey(sortedArray)) {
                map.put(sortedArray, new ArrayList<>());
            }
            map.get(sortedArray).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = getGroupAnagrams(strs);
        System.out.println(list);


    }
}
//Output: {["bat"],["nat","tan"],["ate","eat","tea"]}/