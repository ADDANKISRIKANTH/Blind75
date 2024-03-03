package org.example.intersectionOfArrays;

import java.util.*;

public class IntersectionOfArrays2 {

    public static int[] getIntersectionOfArrays(int[] arr1,int[] arr2){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr1.length; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }else{
                map.put(arr1[i],1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr2.length; i++){

            if(map.containsKey(arr2[i]) && map.get(arr2[i]) > 0){
                list.add(arr2[i]);
                map.put(arr2[i],map.get(arr2[i])-1);
            }
        }

        int[] values = new int[list.size()];
        for(int i=0; i<list.size();i++){
            values[i] = list.get(i);
        }
        return values;

    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,1};
        int [] arr2 = {2,2};
        System.out.println(Arrays.toString(getIntersectionOfArrays(arr1,arr2)));
    }
}
