package com.LogicMojo.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        boolean flag = false;

        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean k = containsDuplicate(arr);
        System.out.println(k);
    }
}
