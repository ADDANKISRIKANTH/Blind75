package org.example.arrays.Anagrams;

public class BestCaseAnagram {

    public static boolean isAnagram(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                temp += str.charAt(i);
            }
        }

        temp = temp.toLowerCase();

        int start = 0;
        int end = temp.length() - 1;
        while (start <= end) {

            if (temp.charAt(start) != temp.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Anna";
        boolean value = isAnagram(str);
        System.out.println(value);
    }
}
