package com.LogicMojo.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfSubArrays {

    public static int getLenSumOfSubArray(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }

            }

        }
        return count;

    }


    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1, right+1}; // Indices are 1-based
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}


//[2,7,11,15], target = 9
//left =0
//right = 1
//sum = 2+15 = 17
//sum = 2+11 = 13
//sum = 2+7 = 9
//retun 0,1



//count = 3
//map = 2,1,4,5,7,6,10
//2,-1,3,1,2,-1,4
// preficSum = 2,1,4,5,7,6,10


//2-5 = -3
//1-5 = -4
//4-5 = -1
//5-5 = 0
//7-5 = 2
//6-5 = 1
//10-5=5


