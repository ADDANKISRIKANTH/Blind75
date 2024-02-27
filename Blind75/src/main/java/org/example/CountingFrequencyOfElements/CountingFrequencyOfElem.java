package org.example.CountingFrequencyOfElements;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequencyOfElem {

    public static void getFrequentElement(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        int [] arr = {10,20,20,10,30,20,30,30,30,40,40,50,50,50};
        getFrequentElement(arr);
    }
}
