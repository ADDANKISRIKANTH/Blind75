package org.example.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BetterApproachTwoSum {

    private static int[] getTwoSum(int [] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int sum = target - arr[i];
            if(map.containsKey(sum)){
                return new int[]{
                        map.get(sum),i
                };

            }else{
                map.put(arr[i],i);
            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] a = {3,2,4};
        int [] val = getTwoSum(a,6);
        System.out.println(Arrays.toString(val));
    }
}
