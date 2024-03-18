package com.LogicMojo.Arrays;

public class SumOfAllEle {

    public static int sumOfEle(int [] arr){
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {10,23,25,28,35,40,50,60};
        int value = sumOfEle(arr);
        System.out.println(value);
    }
}
