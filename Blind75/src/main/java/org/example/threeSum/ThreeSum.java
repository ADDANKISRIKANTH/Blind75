package org.example.threeSum;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> getThreeSum(int [] arr){
        Set<List<Integer>> set = new HashSet<>();
        int first,second,third;
        int target=0, newTarget;
        List<Integer> tripplet = null;
        Map<Integer,Integer> map;
        for(int i=0; i<arr.length;i++){
            first = arr[i];
            newTarget = target - first;
            map = new HashMap<>();

            for(int j=i+1; j< arr.length;j++){
                second = arr[j];
                if(map.containsKey(newTarget - second)){

                    third = newTarget - second;
                    tripplet = new ArrayList<>();
                    tripplet.add(first);
                    tripplet.add(second);
                    tripplet.add(third);
                    Collections.sort(tripplet);
                    set.add(tripplet);

                }else{
                    map.put(second,j);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int val = getSumOfThree(arr,1);
        System.out.println(val);
    }


    public static int getSumOfThree(int[] arr,int target){
        int val = 0;
        Map<Integer, Integer> map;

        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            int newTarget = target - first;
            map = new HashMap<>();

            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];
                int complement = newTarget - second;

                if (map.containsKey(complement)) {
                    int third = map.get(complement);
                    val = first + second + arr[third];
                    return val;
                } else {
                    map.put(second, j);
                }
            }
        }

        return val;
    }
}
