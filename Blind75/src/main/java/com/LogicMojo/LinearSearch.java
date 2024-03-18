package com.LogicMojo;

public class LinearSearch {


    public static int searchAnElement(int[] arr,int target){

        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){

            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {10,23,25,28,35,40,50,60};
        int k = searchAnElement(arr,40);
        System.out.println(k);
    }
}
