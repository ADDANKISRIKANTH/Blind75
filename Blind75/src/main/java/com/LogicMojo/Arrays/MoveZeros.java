package com.LogicMojo.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {


    public static int[] getAllMovedZerosToEnd(int [] arr){

        int index = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        return arr;
    }

    public static int[] moveAllZerosToEnd(int[] arr){
        List<Integer> lis = new ArrayList<>();

        for(int i=0; i<arr.length;i++){
            if(arr[i] != 0){
                lis.add(arr[i]);
            }
        }

        for(int j=0;j<lis.size();j++){
            arr[j] = lis.get(j);
        }

        for(int i=lis.size(); i<arr.length;i++){
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,0,2,3,2,0,0,4,5,1};
        System.out.println(Arrays.toString(moveAllZerosToEnd(arr)));
    }
}
