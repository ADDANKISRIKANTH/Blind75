package org.example.DailyTempretures;

import java.util.Arrays;
import java.util.Stack;

public class DailyTempretures {

//    Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead

//    Example 1:
//    Input: temperatures = [73,74,75,71,69,72,76,73]
//    Output: [1,1,4,2,1,1,0,0]
//    Example 2:
//    Input: temperatures = [30,40,50,60]
//    Output: [1,1,1,0]

    public  static int[] getDailyTemp(int[] temp){
        int[] arr = new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<temp.length; i++){

            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                arr[stack.peek()] = i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] value = {74,75,72,76,77,71,70};
        int[] k = getDailyTemp(value);
        System.out.println(Arrays.toString(k));
    }
}

// 1,



