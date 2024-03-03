package org.example.maximumErasureValue;

import java.util.HashMap;

public class MaxErasureValue {

    public static int getMaxErasureVal(int [] arr){
        int ans=0;
        int sum=0;
        int i=0;
        int val=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int j=0; j<arr.length;j++){

            val = arr[j];
            if(map.containsKey(val)){

                while(i<arr.length && map.containsKey(val)){
                    map.remove(arr[i]);
                    sum = sum-arr[i];
                    i++;
                }
            }
            map.put(val,j);
            sum = sum+arr[j];
            ans = Math.max(sum,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {4,2,4,5,6};
        int value = getMaxErasureVal(arr);
        System.out.println(value);
    }
}
