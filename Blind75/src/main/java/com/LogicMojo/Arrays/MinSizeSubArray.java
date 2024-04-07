package com.LogicMojo.Arrays;

import java.util.HashMap;
import java.util.Map;

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



    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        int sum = 0;
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }else{
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3};

        int k = subarraySum(arr,3);
        System.out.println(k);
    }
}
