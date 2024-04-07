package com.LogicMojo.Arrays;

import java.util.Arrays;

import static javax.swing.Spring.height;

public class MaxSubArray {

    public static int getMaxSubArray(int[] arr){
        int maxSum = arr[0];
        int finalMax = arr[0];

        for(int i=1; i<arr.length;i++){
            maxSum = Math.max(arr[i],maxSum+arr[i]);
            finalMax = Math.max(maxSum,finalMax);
        }
        return finalMax;

    }

    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i < height.length-1; i++){

            for(int j=i+1; j<height.length; j++){
                int area = Math.min(height[i],height[j])*(j-1);
                max = Math.max(max,area);
            }
        }

        return max;

    }

    static void reverseWords(String s){
        String[] words = s.split("\\.");
        System.out.println(Arrays.toString(words));
        int start=0;
        int end=words.length-1;

        while(start <= end){
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(words));
        String reversedString = String.join(".",words);
        System.out.println(reversedString);
    }
// 6,4
    // 4, 1,2,4
    //6, 1,2,3,6
    public static void main(String[] args) {
        reverseWords("i.like.this.program.very.much");
    }
}
