package org.example.intersectionOfArrays;

import java.util.*;

public class IntersectionOfArrays {

    public static int [] getIntersectionOfArrays(int[] arr1,int [] arr2){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr1.length; i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr2.length; i++){

            if(map.containsKey(arr2[i]) && !list.contains(arr2[i])){
                list.add(arr2[i]);
            }
        }

        int[] arrVal = new int[list.size()];
        for(int j=0; j<list.size();j++){
            arrVal[j] = list.get(j);
        }
        return arrVal;
    }
    public static void main(String[] args) {
        int[] arr1 = {10,10,20,30,20,40,50,50,60};
        int [] arr2 = {10,15,20,40,70,80,90,50,90};
        System.out.println(Arrays.toString(getIntersectionOfArrays(arr1,arr2)));
    }
}
