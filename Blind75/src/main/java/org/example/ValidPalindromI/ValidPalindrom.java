package org.example.ValidPalindromI;

public class ValidPalindrom {

    public static boolean validPalindrome(String s) {
        int start = 0;
        int end=s.length()-1;

        if(isPalindrome(start,end,s)){
            return true;
        }

        while(s.charAt(start) == s.charAt(end)){
            start++;
            end--;
        }
        boolean a = isPalindrome(start+1,end,s);
        boolean b = isPalindrome(start,end-1,s);

        return a || b;
    }

    private static boolean isPalindrome(int start,int end,String str){

        while(start <= end){

            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("ab"));
        System.out.println(validPalindrome("abc"));
        System.out.println(validPalindrome("abacd"));
    }
}
