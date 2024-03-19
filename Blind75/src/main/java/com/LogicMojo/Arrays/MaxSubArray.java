package com.LogicMojo.Arrays;

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
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int k = getMaxSubArray(arr);
        System.out.println(k);
    }
}
