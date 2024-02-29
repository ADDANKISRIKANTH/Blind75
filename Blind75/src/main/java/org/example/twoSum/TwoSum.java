package org.example.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public static int [] getTwoSum(int [] arr,int target){
        int [] value = {-1,-1};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){

            if(map.containsKey(target-arr[i])){
                value[0] = i;
                value[1] = map.get(target-arr[i]);
                break;
            }else{
                map.put(arr[i],i);
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7};
        int[] k = getTwoSum(arr,10);
        System.out.println(Arrays.toString(k));
    }
}
