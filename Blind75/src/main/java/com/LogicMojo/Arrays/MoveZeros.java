package com.LogicMojo.Arrays;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(getAllMovedZerosToEnd(arr)));
    }
}
