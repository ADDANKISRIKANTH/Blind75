package com.LogicMojo.Arrays;

public class MinSizeSubArray {

    public static int getMinSubArray(int [] arr,int target){
        int start=0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum +=arr[i];

            while(sum >= target){
                min = Math.min(min,i+1-start);
                sum -= arr[start];
                start++;
            }
        }
        return min == Integer.MAX_VALUE ?0:min;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,1,1,1};

        int k = getMinSubArray(arr,11);
        System.out.println(k);
    }
}
