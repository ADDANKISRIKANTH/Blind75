package com.LogicMojo.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Single {

    public static int getValues(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> keyVal : map.entrySet()){
            if(keyVal.getValue() == 1){
                return keyVal.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = { 4,1,2,1,2};
        int val = getValues(arr);
        System.out.println(val);
    }
}
