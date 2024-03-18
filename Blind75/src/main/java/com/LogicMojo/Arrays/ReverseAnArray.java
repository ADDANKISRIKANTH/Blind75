package com.LogicMojo.Arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static int[] leftRotateAnArray(int arr[],int k){

        int first = arr[0];

        for(int i=1; i<arr.length-1;i++){
            arr[i-k] = arr[i];
        }
        arr[arr.length-1] = first;
        return arr;
    }

    public static int[] bruteForceArrayRotation(int[] arr,int k){
        int[] temp = new int[k];

        for(int i=0; i<k;i++){
            temp[i] = arr[i];
        }

        for(int i=k; i<arr.length;i++){
            arr[i-k] = arr[i];
        }

        for(int i=0; i<k;i++){
            arr[arr.length -k+i] = temp[i];
        }
        return arr;
    }

    public static int[] getOptimisedKRotate(int[] arr, int n, int k) {
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1); // Corrected indexing here
        reverse(arr, 0, n - 1);
        return arr;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int [] arr = {10,23,25,28,35,40,50,60};
        int [] k = getOptimisedKRotate(arr,8,3);
        System.out.println(Arrays.toString(k));
    }
}
