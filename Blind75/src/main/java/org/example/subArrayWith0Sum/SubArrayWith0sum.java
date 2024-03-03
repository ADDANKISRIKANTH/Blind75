package org.example.subArrayWith0Sum;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWith0sum {

    public static boolean getSubArray0sum(int [] arr){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum ==0 || arr[i] == 0 || list.contains(sum)){
                return true;
            }
            list.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {4,2,-3,1,6};
        boolean k = getSubArray0sum(arr);
        System.out.println(k);
    }
}
