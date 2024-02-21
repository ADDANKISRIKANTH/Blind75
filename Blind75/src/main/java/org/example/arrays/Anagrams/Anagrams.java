package org.example.arrays.Anagrams;

public class Anagrams {
        private static boolean isAnagram(String s,String t){
            int s_len = s.length();
            int t_len = t.length();

            int[] arr = new int[26];
            if(s_len != t_len){
                return false;
            }
            for(int i=0; i<s_len; i++){
                arr[s.charAt(i)-'a']++;
                arr[t.charAt(i)-'a']--;
            }

            for(int k:arr){
                if(k != 0){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "ngaram";
        if(isAnagram(s,t)){
            System.out.println("anagram");
        }else{
            System.out.println("not an anagram");
        }
    }
}
