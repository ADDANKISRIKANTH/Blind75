package com.LogicMojo.Arrays;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindUniqueElements {

    public static int getUniqueElement(int [] arr){
        Map<Integer,Integer> val = new HashMap<>();

        for(int i=0; i<arr.length;i++){
            if(val.containsKey(arr[i])){
                val.put(arr[i],val.get(arr[i])+1);
            }else{
                val.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> map : val.entrySet()){
            if(map.getValue() == 1){
                return map.getKey();
            }
        }
        return -1;

    }

    public static int[] getUniqueValues(int[] arr){
        int start=1;
        int end = arr.length-1;
        int begain = 0;
        while(start <=end){

            if(arr[start] != arr[start-1]){
                arr[begain] = arr[start];
                begain++;
            }
            start++;
        }
        return arr;
    }
    public static void main(String[] args) {
//        int [] arr = {2,3,1,6,3,6,2};
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] value = getUniqueValues(arr);
        System.out.println(Arrays.toString(value));
    }
}
