package org.example.consicutive;

public class ConsicutiveCharacter {

    public static int maxPower(String str){
        int max = 0; int count=1;

        char prev,current;
        int  i = 1;
        int n = str.length();
        while(i<n){
            prev = str.charAt(i-1);
            current = str.charAt(i);
            if(prev == current){
                count++;
            }else{
                max = max > count ? max : count;
                count = 1;
            }
            i++;
        }
        return max>count?max:count;
    }
    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbccdddeeeeeff"));
    }
}
